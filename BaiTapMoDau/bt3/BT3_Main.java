package BaiTapMoDau.bt3;

public class BT3_Main {
    public static void main(String[] args) {
        SinhVienNTU sinhVienNTU1 = new SinhVienIT("Tấn Nghĩa", "CNTT", 10, 10, 10);
        SinhVienNTU sinhVienNTU2 = new SinhVienIT("Tấn Nghĩa", "CNTT", 10, 10, 10);
        SinhVienNTU sinhVienNTU3 = new SinhVienBiz("Tấn Nghĩa", "CNTT", 10, 10) ;
        sinhVienNTU1.Xuat();
        sinhVienNTU2.Xuat();
        sinhVienNTU3.Xuat();
    }

}
