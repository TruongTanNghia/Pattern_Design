package Responsibility.ThucHanh.TinhTienDien;

public class TinhTien implements ITienDien{
    float gia;
    int min, max;
    ITienDien thangbac;
    public TinhTien(float gia, int min, int max) {
        this.gia = gia;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITienDien thangbac(ITienDien tinhtien) {
        thangbac = tinhtien;
        return tinhtien;
    }
    @Override
    public float tinhtien(float sodien) {
        if(sodien <= max){
            return (sodien-min)*gia;
        }else{
            return (max-min)*gia + thangbac.tinhtien(sodien);
        }
    }

}
