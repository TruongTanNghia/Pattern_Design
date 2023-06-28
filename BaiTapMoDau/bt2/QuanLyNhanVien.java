package BaiTapMoDau.bt2;
//import btjava.bt1.NhanVien;

import BaiTapMoDau.bt1.NhanVien;

import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
    }

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv : dsNhanVien) {
            System.out.println(nv.getThongTin());
        }
    }
}
