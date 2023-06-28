package NhomMauHanhVi.Template.ThucHanh.Bai1;

public class KH_Vang extends GioHang {
    @Override
    protected float tinhChietKhau(float tongTien) {
        float tinhChiecKhau = 0;
        if (tongTien >= 50000)
            tinhChiecKhau = (float) (tongTien * 0.03);
        else if (tongTien >= 1000000) {
            tinhChiecKhau = (float) (tongTien *0.05);
        }
        return tinhChiecKhau;
    }
}
