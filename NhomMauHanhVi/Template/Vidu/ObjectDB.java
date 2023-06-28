package NhomMauHanhVi.Template.Vidu;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    List<T> list = new ArrayList<>();

    public abstract int getID(T t);
    T findByID(int id) {
        for (var t: list) {
            if (getID(t) == id)
                return t;
        }
        return null;
    }

    public void add(T t) {
        for (var o: list) {
            if (getID(o) == getID(t))
                return;
        }
        list.add(t);
    }

    public void update(T t) {
        for(int i = 0; i < list.size(); i++) {
            if(getID(list.get(i)) == getID(t)) {
                list.set(i, t);
                return;
            }
        }
    }

    public void deleteByID(int id) {
        for(var o: list) {
            if(getID(o) == id) {
                list.remove(o);
                return;
            }
        }
    }
}