package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai1;

public class BieuThucDonGian extends BieuThuc{
    float ToanHang;

    public BieuThucDonGian(float toanHang) { this.ToanHang = toanHang ;}

    @Override
    public float giaTri() {
        return this.ToanHang;
    }

    @Override
    public String bieuThuc() {
        return "" + ToanHang;
    }
}
