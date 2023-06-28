package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai1_ATM;

public class RutTienATMVND extends RutTienATM{
    IRutTienATM menhgia500 = new RutTienTheoMenhGia(500);
    IRutTienATM menhgia100 = new RutTienTheoMenhGia(100);
    IRutTienATM menhgia50 = new RutTienTheoMenhGia(50);
    IRutTienATM menhgia10 = new RutTienTheoMenhGia(10);
    IRutTienATM menhgia1 = new RutTienTheoMenhGia(1);

    public RutTienATMVND() {
        menhgia500.menhGiaKeTiep(menhgia100)
                .menhGiaKeTiep(menhgia50)
                .menhGiaKeTiep(menhgia10)
                .menhGiaKeTiep(menhgia1);
    }

    @Override
    public IRutTienATM factory(int menhGia) {
        if(menhGia == 500)
            return menhgia500;
        if(menhGia == 100)
            return menhgia100;
        if(menhGia == 50)
            return menhgia50;
        if(menhGia == 10)
            return  menhgia10;
        return  menhgia1;
    }
}




















//    iRutTienATM a1=new RutTienATMMenhGia(500, "500k");
//    iRutTienATM a2=new RutTienATMMenhGia(200, "200k");
//    iRutTienATM a3=new RutTienATMMenhGia(100, "100k");
//    iRutTienATM a4=new RutTienATMMenhGia(50, "50k");
//    iRutTienATM a5=new RutTienATMMenhGia(20, "20k");
//    iRutTienATM a6=new RutTienATMMenhGia(10, "10k");
//    iRutTienATM a7=new RutTienATMMenhGia(5, "5k");
//    iRutTienATM a8=new RutTienATMMenhGia(2, "2k");
//    iRutTienATM a9=new RutTienATMMenhGia(1, "1k");
//    public MenhGia() {a1.menhGiaKeTiep(a2).menhGiaKeTiep(a3).menhGiaKeTiep(a4).menhGiaKeTiep(a5).menhGiaKeTiep(a6).menhGiaKeTiep(a7).menhGiaKeTiep(a8).menhGiaKeTiep(a9);}
//
//    @java.lang.Override
//    public iRutTienATM factory(int menhGia) {
//        if (menhGia==500)
//            return a1;
//        else if(menhGia==200)
//            return a2;
//        else if(menhGia==100)
//            return a3;
//        else if(menhGia==50)
//            return a4;
//        else if(menhGia==20)
//            return a5;
//        else if(menhGia==10)
//            return a6;
//        else if(menhGia==5)
//            return a7;
//        else if(menhGia==2)
//            return a8;
//        else if(menhGia==1)
//            return a9;
//        return a1;
//    }
//}