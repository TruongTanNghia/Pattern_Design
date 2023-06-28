package NhomMauCauTruc.Composite_pattern.ThucHanh.DuyetCay;

public class Nut implements CayNhiPhan {
    private final String giaTri;
    private final CayNhiPhan conTrai;
    private final CayNhiPhan conPhai;

    public Nut(String giaTri, CayNhiPhan conTrai, CayNhiPhan conPhai) {
        this.giaTri = giaTri;
        this.conTrai = conTrai;
        this.conPhai = conPhai;
    }

    @Override
    public void duyetCay() {
        System.out.println("Giá trị của nút: " + giaTri);
        System.out.println("Các nút con:");
        if (conTrai != null) {
            conTrai.duyetCay();
        }
        if (conPhai != null) {
            conPhai.duyetCay();
        }
    }
}


