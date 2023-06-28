package BaiTapMoDau.bt2;
import BaiTapMoDau.bt1.NhanVien;
public class BT2_Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        // Khởi tạo 2 đối tượng nhân viên
        NhanVien nhanVien1 = new NhanVien("Nguyen Van A", 25, "Ha Noi", 10000000, 180);
        NhanVien nhanVien2 = new NhanVien("Tran Thi B", 30, "Ho Chi Minh", 12000000, 220);

        // In thông tin của nhân viên ra màn hình
        System.out.println("Thông tin nhân viên 1: " + nhanVien1.getThongTin());
        System.out.println("Thông tin nhân viên 2: " + nhanVien2.getThongTin());

        // Tính tiền thưởng của nhân viên
        //nhanVien1
        double thuong1 = nhanVien1.tinhThuong();
        if (thuong1 == 0) {
            System.out.println(nhanVien1.getTen() + " không được nhận tiền thưởng.");
        } else {
            System.out.println(nhanVien1.getTen() + " được nhận tiền thưởng là " + thuong1 + " đồng.");
        }
        // nhanVien2
        double thuong2 = nhanVien2.tinhThuong();
        if (thuong2 == 0) {
            System.out.println(nhanVien2.getTen() + " không được nhận tiền thưởng.");
        } else {
            System.out.println(nhanVien2.getTen() + " được nhận tiền thưởng là " + thuong2 + " đồng.");
        }
        quanLyNhanVien.them(new NhanVien("Nguyen Van C", 26, "Phu Yen", 10000000, 300));
        quanLyNhanVien.inDS();
    }
}
