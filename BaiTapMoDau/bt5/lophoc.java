package BaiTapMoDau.bt5;

import java.util.ArrayList;

public class lophoc {
    private ArrayList<hocsinh> danhSachHocSinh;
    private ArrayList<giaovien> danhSachGiaoVien;


    public lophoc() {
        danhSachHocSinh = new ArrayList<>();
        danhSachGiaoVien = new ArrayList<>();
    }

    public void themHocSinh(hocsinh hs) {
        danhSachHocSinh.add(hs);
    }

    public void themGiaoVien(giaovien gv) {
        danhSachGiaoVien.add(gv);
    }

    public void inDSHocSinh() {
        System.out.println("Danh sách học sinh:");
        for (hocsinh hs : danhSachHocSinh) {
            System.out.println(hs.HienThiTT());
        }
    }

    public void inDSGiaoVien() {
        System.out.println("Danh sách giáo viên:");
        for (giaovien gv : danhSachGiaoVien) {
            System.out.println(gv.HienThiTT());
        }
    }
}

