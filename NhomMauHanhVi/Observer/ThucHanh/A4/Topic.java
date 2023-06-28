//subject
package NhomMauHanhVi.Observer.ThucHanh.A4;



import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> tins = new ArrayList<>();
    List<INhanTin> observers = new ArrayList<>();

    /*
        1. attach
        2. detach
        3. notify (private)
        4. taoMoi
        5. capNhat
     */
    public void attach(INhanTin o){
        if(!observers.contains(o))
            observers.add(o);
    }

    public void detach(INhanTin o){
        if(observers.contains(o))
            observers.remove(o);
    }
    private void thongBao(TinTuc t){
        for(INhanTin o:observers)
            o.capNhat(t);
    }

    public void taoMoi(TinTuc t){
        tins.add(t);
        thongBao(t);
    }
    public void capNhat(TinTuc t){
        for (TinTuc old : tins)
            if(old.id == t.id){
                old.noiDung = t.noiDung;
                thongBao(t);
                break;
            }
    }

    public static interface INhanTin {
        public void capNhat(TinTuc t);
    }
}
