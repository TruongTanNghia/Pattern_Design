package NhomMauHanhVi.Template.ThucHanh.Bai1;

import java.util.ArrayList;
import java.util.List;

public abstract class GioHang {
    List<MatHang> dsMH = new ArrayList<>();
    public void add(MatHang mh){
        dsMH.add(mh);
    }
    protected abstract float tinhChietKhau(float tongTien);
    private float tinhTien() {
        float tongTien = 0;
        for (MatHang m : dsMH) {
            tongTien += m.getThanhTien();
        }
        return tongTien;
    }
    public void hienThiGioHang() {
        System.out.println("Thông tin giỏ hàng của quý Khách Gồm: ");
        for (MatHang m : dsMH){
            System.out.println(m.toString());
        }
        float tongTien = tinhTien();
        float chietKhau = tinhChietKhau(tongTien);
        float tongTienSauCK = tongTien - chietKhau;
        System.out.println("Tiền Phải Trả Là: " + tongTienSauCK);
        System.out.println("Tiền Chiết Khấu Là: " + chietKhau);
        System.out.println("Tổng Tiền Hàng Là: " + tongTien);
    }

}
