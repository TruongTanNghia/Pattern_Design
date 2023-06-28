package NhomMauHanhVi.Template.ThucHanh.Bai1;

public class Main {
    public static void main(String[] args) {
        GioHang KH_ = new KH_KimCuong();
        MatHang mh1 = new MatHang("Áo Thun 3 Lỗ", 500000, 1);
        MatHang mh2 = new MatHang("Quần Short Rách Như Tấm Lau Nhà", 500000, 1);

        KH_.add(mh1);
        KH_.add(mh2);
        KH_.hienThiGioHang();
//        KH_.tinhChietKhau();

    }
}