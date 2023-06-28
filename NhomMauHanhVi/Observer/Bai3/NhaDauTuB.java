package NhomMauHanhVi.Observer.Bai3;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy() {
        t.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta > 0)
            System.out.println("B: Bán ra");
        else if (delta == 0)
            System.out.println("B: Ngồi chờ");
            else System.out.println("B: Bán ra");
    }
}
