package NhomMauHanhVi.Template.ThucHanh.Bai1;

public class KH_ThanThiet extends GioHang{
    @Override
    protected float tinhChietKhau(float tongTien) {
        float tinhChiecKhau = 0;
        if (tongTien >= 500000) tinhChiecKhau = (float) (tongTien * 0.02);
        return tinhChiecKhau;
    }
}
