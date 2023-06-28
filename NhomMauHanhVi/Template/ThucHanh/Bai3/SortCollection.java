package NhomMauHanhVi.Template.ThucHanh.Bai3;

import java.util.Collections;
import java.util.List;

public abstract class SortCollection <T>{
    protected abstract int compare(T t1, T t2);
    public void sort (List<T> list){
        Collections.sort(list, this::compare);
    }

    protected abstract int compare(Product t1, Product t2);
}
