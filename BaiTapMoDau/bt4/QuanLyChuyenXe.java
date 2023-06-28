package BaiTapMoDau.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList<>();
    void them(ChuyenXe cx){
        dsChuyenXe.add(cx);
    }
    void InDS(){
        for (ChuyenXe chuyenXe:dsChuyenXe){
            System.out.println(chuyenXe.toString());
        }
    }

    int doanhThuXeNoiThanh(){
        int tong = 0;
        for(ChuyenXe cx:dsChuyenXe)
            if(cx instanceof XeNoiThanh)
                tong +=cx.doanhThu;
        return tong;
    }
    int doanhThuXeNgoaiThanh(){
        int tong = 0;
        for(ChuyenXe cx:dsChuyenXe)
            if(cx instanceof XeNgoaiThanh)
                tong +=cx.doanhThu;
        return tong;
    }
    int tongDoanhThu(){
        int tong = 0;
        for(ChuyenXe cx:dsChuyenXe)
            if(cx instanceof ChuyenXe)
                tong +=cx.doanhThu;
        return tong;
    }
}
