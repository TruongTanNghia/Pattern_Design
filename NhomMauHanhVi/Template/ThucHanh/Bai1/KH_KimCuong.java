package NhomMauHanhVi.Template.ThucHanh.Bai1;

public class KH_KimCuong extends GioHang{

    @Override
    public float tinhChietKhau(float tongTien) {
        float tinhChietKhau = 0;
        if (tongTien >= 1500000 )
            tinhChietKhau = (float) (tongTien * 0.06);
        else if (tongTien >= 1000000){
            tinhChietKhau = (float) (tongTien * 0.05);
        }
        else if (tongTien >= 500000){
            tinhChietKhau = (float) (tongTien * 0.03);
        }
        return tinhChietKhau;
    }
}
