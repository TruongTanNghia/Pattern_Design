//Subject
package NhomMauHanhVi.Observer.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Stream{
    List<StreamListener> listeners = new ArrayList<>();
    public void listen(StreamListener listener){
        listeners.add(listener);
    }

    void addEvent(List<MonHoc> list){
        for(var listener: listeners){
            listener.handle(list);

        }
    }
    public static interface StreamListener{
        void handle(List<MonHoc> t);
    }


}












//package btjava.observer.bta1;
//import java.util.ArrayList;
//import java.util.List;
//
//class Stream<T> {
//    private List<IListener<T>> listeners = new ArrayList<>();
//    private List<T> events = new ArrayList<>();
//
//    public void addEvent(T t) {
//        events.add(t);
//        notifyListeners(t);
//    }
//
//    public void listen(IListener<T> listener) {
//        listeners.add(listener);
//    }
//
//    private void notifyListeners(T t) {
//        for (IListener<T> listener : listeners) {
//            listener.update(t);
//        }
//    }
//
//    public static interface IListener<T> {
//        void update(T event);
//    }
//}