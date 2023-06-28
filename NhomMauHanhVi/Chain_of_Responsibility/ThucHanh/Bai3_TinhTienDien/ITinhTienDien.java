package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai3_TinhTienDien;

public interface ITinhTienDien {
    ITinhTienDien bacKeTiep(ITinhTienDien tinhTienDien);
    double tinhTien(double soDien);
}
