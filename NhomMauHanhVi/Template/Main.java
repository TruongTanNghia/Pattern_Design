package NhomMauHanhVi.Template;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        QLData<SinhVien> qlsv = new QLSinhVien();
        SinhVien sv1 = new SinhVien(0, "123", "quang", "10/05/2001", "Phu Yen");
        SinhVien sv2 = new SinhVien(1, "234", "tran", "11/05/2001", "Binh Dinh");
        SinhVien sv3 = new SinhVien(2, "345", "nhat", "12/05/2001", "Khanh Hoa");
        SinhVien sv4 = new SinhVien(3, "456", "minh", "13/05/2001", "Binh Thuan");
        SinhVien sv5 = new SinhVien(4, "567", "hau", "14/05/2001", "Ha Noi");
        SinhVien sv6 = new SinhVien(5, "678", "hiep", "15/05/2001", "HCM");

        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        qlsv.them(sv4);
        qlsv.them(sv5);
        qlsv.them(sv6);
        SinhVien svcapnhat = new SinhVien(5, "000", "hiep", "khong nho", "khong biet nua");
        qlsv.capnhat(svcapnhat);

        qlsv.hienthi();
    }
}
