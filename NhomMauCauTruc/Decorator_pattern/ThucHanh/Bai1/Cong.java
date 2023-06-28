package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai1;

public class Cong extends BieuThucDecorator{
    public  int toanHang;

    public Cong(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + "+" + giaTri();
    }
}
