//observers
package NhomMauHanhVi.Observer.ThucHanh.A4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.INhanTin {
    Topic t;
    List<TinTuc> tins = new ArrayList<>();

    public ThanhVienB(Topic t) {
        this.t = t;
        t.attach(this);
    }

    @Override
    public void capNhat(TinTuc t) {
        System.out.println("\nThành viên B");
        tins.add(t);
        int i=1;
        for(TinTuc tin: tins)
        {
            System.out.println("- Tin " + i + " có nội dung là: "+ tin.noiDung + "\n");
            i++;
        }
    }
}
