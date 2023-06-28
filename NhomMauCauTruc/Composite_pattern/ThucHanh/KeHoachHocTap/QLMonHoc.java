package NhomMauCauTruc.Composite_pattern.ThucHanh.KeHoachHocTap;

import java.util.ArrayList;
import java.util.List;

public class QLMonHoc extends KeHoacHocTap{
    List<KeHoacHocTap> List = new ArrayList<>();
    @Override
    public String getMonHoc() {
        String tenMh="";
        for(KeHoacHocTap keHoacHocTap: List)
            tenMh += keHoacHocTap.getMonHoc();
        return tenMh;
    }

    @Override
    public int getoTC() {
        int soTC=0;
        for (KeHoacHocTap keHoacHocTap: List)
            soTC += keHoacHocTap.getoTC();
        return soTC;
    }

    @Override
    public int getHocPhi() {
        int hocPhi=0;
        for (KeHoacHocTap keHoacHocTap: List)
            hocPhi += keHoacHocTap.getHocPhi();
        return hocPhi;
    }

    @Override
    public void add(KeHoacHocTap keHoacHocTap) {
        List.add(keHoacHocTap);
    }

    @Override
    public String toString() {
        return
                "TenMH Gồm: \n" + getMonHoc() +
                "\nTổng Số TC=" + getoTC() +
                "\nTổng HocPhi=" + getHocPhi() ;
    }
}
