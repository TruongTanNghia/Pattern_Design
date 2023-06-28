package BaiTapMoDau.bt4;

public class BT4_Main {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        ChuyenXe chuyenXe1 = new XeNgoaiThanh("62132986","Tấn Nghĩa1", "123",100,"Đà Lạt",2);
        ChuyenXe chuyenXe2 = new XeNgoaiThanh("62132987","Tấn Nghĩa2", "124",100,"Đà Lạt",2);
        ChuyenXe chuyenXe3 = new XeNgoaiThanh("62132988","Tấn Nghĩa3", "125",100,"Đà Lạt",2);
        ChuyenXe chuyenXe4 = new XeNoiThanh("6213298","Tấn Nghĩa4", "126",100,2,2);
        ChuyenXe chuyenXe5 = new XeNoiThanh("62132990","Tấn Nghĩa5", "127",100,2,2);
        ChuyenXe chuyenXe6 = new XeNoiThanh("62132991","Tấn Nghĩa6", "128",100,2,2);
        qlcx.them(chuyenXe1);
        qlcx.them(chuyenXe2);
        qlcx.them(chuyenXe3);
        qlcx.them(chuyenXe4);
        qlcx.them(chuyenXe5);
        qlcx.them(chuyenXe6);
        qlcx.InDS();
        System.out.println("Doanh Thu Ngoại Thành: " + qlcx.doanhThuXeNgoaiThanh());
        System.out.println("Doanh Thu Nội Thành: " + qlcx.doanhThuXeNoiThanh());
        System.out.println("Tổng Doanh Thu: " + qlcx.tongDoanhThu());
    }
}
