package NhomMauHanhVi.Template.ThucHanh.Bai2;

import java.util.ArrayList;
import java.util.List;

public abstract class EnityDB<T> {
    List<T> list = new ArrayList<>();
    public abstract int getKey(T t);
    T findByID(int id){
        for (var t: list){
            if (getKey(t) == id)
                return t;
        }
        return null;
    }
    public int update(T t){
        for (int i=0; i<list.size();i++){
            if (getKey(t)==getKey(list.get(i))){
                list.set(i, t);
                return 1;
            }
        }
        return 0;
    }
    public void delete(T t){

    }
    public boolean add(T t) {
      for (var o:list){
          if (getKey(t) == getKey(o))
              return false;
      }
        list.add(t);
        return true;
    }
    public int deleteByKey(int id){
        for (var o: list){
            if (getKey(o) == id){
                list.remove((o));
                return 1;
            }
        }
        return 0;
    }
}
