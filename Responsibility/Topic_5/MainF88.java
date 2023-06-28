package Responsibility.Topic_5;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyKhoanVay gacCong = new NhanVienF88("Hìn Hồ", "Gác Cổng", 1500000);
        IXuLyKhoanVay gacCuaThangMay = new NhanVienF88("ThiLan", "Gác Cửa Thang Máy", 5000000);
        IXuLyKhoanVay thuKy = new NhanVienF88("Kiệt Bee", "Thư Ký", 15000000);
        IXuLyKhoanVay truongPhong = new NhanVienF88("Nonu", "Trưởng Phòng", 20000000);
        IXuLyKhoanVay phoGiamDoc = new NhanVienF88("Nghĩa", "Phó Giám Đốc", 50000000);
        IXuLyKhoanVay giamDoc = new TongGiamDocF88("Moltion", 900000000);
        gacCong.capCaoHon(gacCuaThangMay)
                .capCaoHon(thuKy)
                .capCaoHon(truongPhong)
                .capCaoHon(phoGiamDoc)
                .capCaoHon(giamDoc);
        System.out.println("Vay tiền 50 triệu: " + gacCong.xuLy(50000000));
    }
}
