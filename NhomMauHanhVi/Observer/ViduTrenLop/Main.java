package NhomMauHanhVi.Observer.ViduTrenLop;

public class Main {
    public static void main(String[] args){
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lan 1: ");
//        System.out.println(C);
        ;
        t.notifyTiGia(10);
        a.huyDangKy();

        System.out.println("Lan 2: ");
        t.notifyTiGia(10);


    }
}
