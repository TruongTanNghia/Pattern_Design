package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai1;

public class GTTD extends BieuThucDecorator{
    public GTTD(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return Math.abs(super.giaTri());
    }

    @Override
    public String bieuThuc() {
        return "|" + super.bieuThuc() + "|";
    }
}
