package NhomMauCauTruc.Composite_pattern.ThucHanh.KeHoachHocTap;

public class Main {
    public static void main(String[] args) {
//        MonHoc MTK = new MonHoc("MTK", 5, 100);
//        MonHoc diDong = new MonHoc("lap Trinh Di Dong", 3,100);
        KeHoacHocTap MTK = new MonHoc("MTK", 5, 100);
        KeHoacHocTap diDong = new MonHoc("\nlap Trinh Di Dong", 3,100);

        KeHoacHocTap Them= new QLMonHoc();
        Them.add(MTK);
        Them.add(diDong);
       System.out.println(Them.toString());
    }
}
