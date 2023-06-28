package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai1_ATM;

public class MainRutTienATM {
    public static void main(String[] args) {
        IRutTienATM menhgia500 = new RutTienTheoMenhGia(500);
        IRutTienATM menhgia100 = new RutTienTheoMenhGia(100);
        IRutTienATM menhgia50 = new RutTienTheoMenhGia(50);
        IRutTienATM menhgia10 = new RutTienTheoMenhGia(10);
        IRutTienATM menhgia1 = new RutTienTheoMenhGia(1);
        menhgia500.menhGiaKeTiep(menhgia100)
                .menhGiaKeTiep(menhgia50)
                .menhGiaKeTiep(menhgia10)
                .menhGiaKeTiep(menhgia1);
        menhgia500.rutTien(294);
        System.out.println("Rút lần 2");
        RutTienATMVND atmvnd = new RutTienATMVND();
        atmvnd.rutTien(293, 50);

    }
}
