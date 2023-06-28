package Responsibility.ThucHanh;

public class RutTienATMMenhGia implements iRutTienATM {
    public int menhGia;
    public String GiaTri;
    private iRutTienATM menhGiaKeTiep;
    public RutTienATMMenhGia(int menhGia, String GiaTri){
        this.menhGia = menhGia;
        this.GiaTri = GiaTri;
    }

    public RutTienATMMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public iRutTienATM menhGiaKeTiep(iRutTienATM rutTienATM) {
        this.menhGiaKeTiep=rutTienATM;
        return rutTienATM;
    }

    @Override
    public void rutTien(int sotien) {
        int ST = ST=sotien/menhGia;
        int Sodu=sotien % menhGia;
        if (ST>0){
            System.out.println("Menh Gia :"+menhGia + "\n Number" + ST);

        }
        if (Sodu>0){
            menhGiaKeTiep.rutTien(Sodu);
        }

    }
}
