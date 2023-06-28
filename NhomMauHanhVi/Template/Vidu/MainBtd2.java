package NhomMauHanhVi.Template.Vidu;

public class MainBtd2 {
    public static void main(String[] args) {
        ObjectDB o1 = new MySinhVienDB();
        ObjectDB o2 = new MyMonHocDB();
        MySinhVien sv1 =  new MySinhVien(62132986,"Phương Hà","21/01/2002","Nha Trang");
        MySinhVien sv2 =  new MySinhVien(62132987,"Hamin","21/01/2002","Nha Trang");
        MyMonHoc mh1 = new MyMonHoc(123, "Mẫu Thiết Kế", 3);
        MyMonHoc mh2 = new MyMonHoc(124, "Lập trình Di Động", 3);
        o1.add(sv1);
        o1.add(sv2);
        o2.add(mh1);
        o2.add(mh2);

        System.out.println(o1.findByID(62132986));
        System.out.println(o2.findByID(123));

    }
}
