package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai1_ATM;

public interface IRutTienATM {
    IRutTienATM menhGiaKeTiep(IRutTienATM rutTienATM);
   void rutTien(int soTien);
}
