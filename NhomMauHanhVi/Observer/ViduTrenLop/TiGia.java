package NhomMauHanhVi.Observer.ViduTrenLop;
import java.util.List;
import java.util.ArrayList;
public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList();
    public void attach(I_TheoDoiTiGia o){
        if(!observers.contains(o))
            observers.add(o);
    }
    public void detach(I_TheoDoiTiGia o){
//        if(observers.contains(o))
            observers.remove(o);
    }
    public void notifyTiGia(float delta){
        for(I_TheoDoiTiGia o: observers)
            o.CapNhatTiGia(delta);
    }
    static public interface I_TheoDoiTiGia{
        void CapNhatTiGia(float delta);
    }
}
