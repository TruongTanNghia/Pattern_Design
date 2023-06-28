package BaiTapMoDau.bt5;


//import btjava.bt1.NhanVien;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QLDS implements IQLDS {
    private List<canhan> danhSachCaNhan;
    private List<hocsinh> danhSachHocSinh;
    private List<giaovien> danhSachGiaoVien;

    public QLDS() {
        danhSachCaNhan = new ArrayList<>();
        danhSachHocSinh = new ArrayList<>();
        danhSachGiaoVien = new ArrayList<>();
    }

    @Override
    public int them(canhan p) {
        danhSachCaNhan.add(p);
        return 0;
    }
    @Override
    public int xoa(String ten) {
        Iterator<canhan> iterator = danhSachCaNhan.iterator();
        while (iterator.hasNext()) {
            canhan p = iterator.next();
            if (ten.equals(p.getHoTen())) {
                iterator.remove();
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for (canhan p : danhSachCaNhan) {
            System.out.println(p.HienThiTT());
        }
    }
}
