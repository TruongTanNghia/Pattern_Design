package Bai3_BoSung;

public class La implements CayNhiPhan {
    private final String giaTri;


    public La(String giaTri) {
        this.giaTri = giaTri;
    }

    @Override
    public void duyetCay() {
        System.out.println(giaTri);
    }
}

