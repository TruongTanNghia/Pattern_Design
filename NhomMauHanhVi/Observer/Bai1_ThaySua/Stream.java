package NhomMauHanhVi.Observer.Bai1_ThaySua;

import java.util.ArrayList;
import java.util.List;

public class Stream <T>{
    private List<T> events = new ArrayList<>();
    private List<Listener<T>> listeners = new ArrayList<>();

    public static interface Listener<T> {
        void onEvent(T event);
    }
    public void addEvent(T event) {
        this.events.add(event);
        notifyListeners(event);
    }

    public void registerListener(Listener<T> listener) {
        this.listeners.add(listener);
    }

    public void unregisterListener(Listener<T> listener) {
        this.listeners.remove(listener);
    }

    private void notifyListeners(T event) {
        for (Listener<T> listener : listeners) {
            listener.onEvent(event);
        }
    }
}
