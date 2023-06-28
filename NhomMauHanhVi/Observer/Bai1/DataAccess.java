package NhomMauHanhVi.Observer.Bai1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    Stream stream;

    public DataAccess(Stream stream) {
        this.stream = stream;
    }

    public void add(MonHoc mh){
        list.add(mh);
        stream.addEvent(list);
    }
    public void update(MonHoc mh){
        for(int i = 0; i<=list.size(); i++){
            if(list.get(i).maMH.equals(mh.getMaMH())){
                list.set(i, mh);
                break;
            }
        }
        stream.addEvent(list);
    }
    public void delete(MonHoc mh){
        list.remove(list);
        stream.addEvent(list);
    }

}
