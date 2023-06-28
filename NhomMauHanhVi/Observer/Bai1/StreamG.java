package NhomMauHanhVi.Observer.Bai1;

import java.util.ArrayList;
import java.util.List;

public class StreamG<T> {
    List<StreamListener> listeners = new ArrayList<>();
    public void listen(StreamListener listener){
        listeners.add(listener);
    }
    void addEvent(T t){
        for(var listener: listeners){
            listener.handle(t);

        }
    }
    public static interface StreamListener<T>{
        void handle(T t);
    }
}
