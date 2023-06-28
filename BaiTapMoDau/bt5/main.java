package BaiTapMoDau.bt5;
public class main {
    public static void main(String[] args) {
        lophoc lh = new lophoc();
        QLDS qlds = new QLDS();
        hocsinh hs1 = new hocsinh("Trương Tấn Nghĩa",21, "Nha Trang", "0794939878", "62.CNTT-2","Chạy, Bơi");
        hocsinh hs2 = new hocsinh("Nguyễn Văn A",20, "Đồng Xuân Phú Yên", "0326037xxx", "61.CNTT-2","Hehe");

        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        qlds.them(hs1);
        qlds.them(hs2);

        giaovien gv1 = new giaovien("Nguyễn Thị B", 20,"Nha Trang - Khánh Hòa","0321078xxx","Tiếng Anh B1.2", "CNTT");
        giaovien gv2 = new giaovien("Nguyễn Thị D", 20,"Nha Trang - Khánh Hòa","0321078xxx","Toán Cao Cấp 1", "CNTT");

        lh.themGiaoVien(gv1);
        lh.themGiaoVien(gv2);
        qlds.them(gv1);
        qlds.them(gv2);
        lh.inDSHocSinh();
        lh.inDSGiaoVien();

        System.out.println("\nDanh sách cá nhân:");
        qlds.inDS();
        qlds.xoa("Nguyễn Văn A");
        System.out.println("\nDanh sách cá nhân sau khi xóa:");
        qlds.inDS();
    }
}
