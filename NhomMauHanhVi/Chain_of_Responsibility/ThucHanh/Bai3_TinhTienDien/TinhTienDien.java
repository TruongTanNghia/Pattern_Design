package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai3_TinhTienDien;

public class TinhTienDien implements ITinhTienDien{

    double gia;
    int min, max;
    private ITinhTienDien bacKeTiep;
    public TinhTienDien(double gia, int min, int max) {
        this.gia = gia;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITinhTienDien bacKeTiep(ITinhTienDien tinhTienDien) {
        this.bacKeTiep = tinhTienDien;
        return tinhTienDien;
    }

    @Override
    public double tinhTien(double soDien) {
        if(soDien <= max)
           return (soDien - min)*gia;
        else
            return (max-min)*gia + bacKeTiep.tinhTien(soDien);
    }
}
