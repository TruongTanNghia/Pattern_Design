package NhomMauHanhVi.Template;
import java.util.ArrayList;
import java.util.List;
public abstract class QLData<T> {
    List<T> list = new ArrayList<>();

    abstract protected int khoa(T t);
    abstract public void hienThi(T t);

    //kiem tra t co trong list hay khong
    public boolean kiemtra(T t){
        for(T o:list){
            if(khoa(o)==khoa(t))
                return true;
        }
        //
        return false;
    }

    public boolean them(T t){
        if(kiemtra(t)==false){
            list.add(t);
            return true;
        }
        //
        return false;
    }

    public int capnhat(T t){
        for(int i =0; i<list.size(); i++){
            if(khoa(t)==khoa(list.get(i))){
                list.set(i, t);
                return i;
            }
        }
        //
        return 0;
    }

    public int xoa(T t){
        for(int i =0; i<list.size(); i++){
            if(khoa(t)==khoa(list.get(i))){
                list.remove(i);
                return i;
            }
        }
        //
        return 0;
    }

    public void hienthi(){
        list.forEach(t -> {
            hienThi(t);
            System.out.println();
        });
    }
}
