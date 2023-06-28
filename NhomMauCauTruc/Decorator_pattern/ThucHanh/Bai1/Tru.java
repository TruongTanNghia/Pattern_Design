package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai1;

public class Tru extends BieuThucDecorator{
    public float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + "-" + giaTri();
    }
}
