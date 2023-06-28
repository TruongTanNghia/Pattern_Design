package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai1_ATM;

public class  RutTienTheoMenhGia implements IRutTienATM {
    int menhGia;
    int soTo;
    int soDu;

    public RutTienTheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    private IRutTienATM menhGiaKeTiep;

    @Override
    public IRutTienATM menhGiaKeTiep(IRutTienATM rutTienATM) {
        this.menhGiaKeTiep = rutTienATM;
        return rutTienATM;
    }

    @Override
    public void rutTien(int soTien) {
        if (soTien >= menhGia) {
            soTo = soTien / menhGia;
            if (soTo > 0) {
                System.out.println("Có " + soTo + " với mệnh giá: " + menhGia);
            }
            soDu = soTien % menhGia;
            if (soDu > 0) {
                menhGiaKeTiep.rutTien(soDu);
            }
        } else {
            menhGiaKeTiep.rutTien(soTien);
        }
    }
}