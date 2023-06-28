package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai1_ATM;

public abstract class RutTienATM {
    public void rutTien(int soTien, int menhGiaLonNhat){
        factory(menhGiaLonNhat).rutTien(soTien);
    }
    public abstract IRutTienATM factory(int menhGia);
}

