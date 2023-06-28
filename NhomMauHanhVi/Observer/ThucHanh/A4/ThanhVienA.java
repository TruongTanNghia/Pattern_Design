//observers
package NhomMauHanhVi.Observer.ThucHanh.A4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienA implements Topic.INhanTin {
    Topic t;
    List<TinTuc> tins = new ArrayList<>();

    public ThanhVienA(Topic t) {
        this.t = t;
        t.attach(this);
    }
    public void huyDangKy(){
        this.t = t;
        t.detach(this);
    }

    @Override
    public void capNhat(TinTuc t) {
        System.out.println("\nThành viên A");
        System.out.println("- Tin mới nhất được thêm có nội dung: " + t.noiDung);
        tins.add(t);
    }
}
