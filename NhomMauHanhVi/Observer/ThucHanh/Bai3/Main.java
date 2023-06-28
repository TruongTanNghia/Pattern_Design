package NhomMauHanhVi.Observer.ThucHanh.Bai3;

public class Main {
    public static void main(String[] args) {
        Tigia t = new Tigia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lan 1");
        t.notifyTiGia(5);
        a.HuyDangKy();
        b.HuyDangKy();
        System.out.println("Lan 2");
        t.notifyTiGia(-5);
    }
}
