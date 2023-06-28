package NhomMauCauTruc.Composite_pattern.ThucHanh.DuyetCay;

public class Main {
    public static void main(String[] args) {
        CayNhiPhan laD = new La("D");
        CayNhiPhan laE = new La("E");
        CayNhiPhan laF = new La("F");
        CayNhiPhan laG = new La("G");

        CayNhiPhan nutB = new Nut("B", laD, laE);
        CayNhiPhan nutC = new Nut("C", laF, laG);

        CayNhiPhan Hien = new Nut("A", nutB, nutC);
        // Duyệt cây và in thông tin
        Hien.duyetCay();
    }

}
