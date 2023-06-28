package Responsibility.ThucHanh;

public class Main {
    public static void main(String[] args){
        //Cau A
        iRutTienATM a1 = new RutTienATMMenhGia(500,"menh gia 500k");
        iRutTienATM a2 = new RutTienATMMenhGia(200,"menh gia 200k");
        iRutTienATM a3 = new RutTienATMMenhGia(100,"menh gia 100k");
        iRutTienATM a4 = new RutTienATMMenhGia(50,"menh gia 50k");
        iRutTienATM a5 = new RutTienATMMenhGia(20,"menh gia 20k");
        iRutTienATM a6 = new RutTienATMMenhGia(10,"menh gia 10k");
        iRutTienATM a7 = new RutTienATMMenhGia(5,"menh gia 5k");
        iRutTienATM a8 = new RutTienATMMenhGia(2,"menh gia 2k");
        iRutTienATM a9 = new RutTienATMMenhGia(1,"menh gia 1k");
        a1.menhGiaKeTiep(a2).menhGiaKeTiep(a2).menhGiaKeTiep(a3).menhGiaKeTiep(a4).menhGiaKeTiep(a5).menhGiaKeTiep(a6).menhGiaKeTiep(a7).menhGiaKeTiep(a8).menhGiaKeTiep(a9);
        a1.rutTien(756);
        //Cau B
        System.out.println("CÂU B: ");
        ATM atm;
        atm = new MenhGia();
        atm.RutTien(500,100);
    }
}
