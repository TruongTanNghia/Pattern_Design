package Responsibility.ThucHanh;

public abstract class ATM {
    public void RutTien(int Tien, int MenhGiaMax) {factory(MenhGiaMax).rutTien(Tien);}
    public abstract iRutTienATM factory(int menhGia);

}

