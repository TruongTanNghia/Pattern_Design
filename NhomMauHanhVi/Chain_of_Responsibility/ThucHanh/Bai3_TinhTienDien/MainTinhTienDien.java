package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai3_TinhTienDien;

public class MainTinhTienDien {
    public static void main(String[] args) {
        ITinhTienDien b1 = new TinhTienDien(1.678, 0, 50);
        ITinhTienDien b2 = new TinhTienDien(1.734, 50, 100);
        ITinhTienDien b3 = new TinhTienDien(2.014, 100, 200);
        ITinhTienDien b4 = new TinhTienDien(2.536, 200, 300);
        ITinhTienDien b5 = new TinhTienDien(2.834, 300, 400);
        ITinhTienDien b6 = new TinhTienDien(2.927, 400, Integer.MAX_VALUE);
        b1.bacKeTiep(b2)
                .bacKeTiep(b3)
                .bacKeTiep(b4)
                .bacKeTiep(b5)
                .bacKeTiep(b6);
        System.out.println("Tổng tiền điện: " + b1.tinhTien(356));
    }
}
