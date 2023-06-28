package NhomMauCauTruc.Composite_pattern.ThucHanh.KeHoachHocTap;

import java.util.List;

public class MonHoc extends KeHoacHocTap{
    String tenMH;
    int soTC;
    int hocPhi;

    public MonHoc(String tenMH, int soTC, int hocPhi) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public String getMonHoc() {
        return tenMH;
    }

    @Override
    public int getoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return hocPhi;
    }

    @Override
    public void add(KeHoacHocTap keHoacHocTap) {

    }
}
