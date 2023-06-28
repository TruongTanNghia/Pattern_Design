package NhomMauHanhVi.Observer.Bai1;

import java.util.ArrayList;
import java.util.List;

public class DataAccessG {
    List<MonHoc> list = new ArrayList<>();
    StreamG<List<MonHoc>> stream;

    public DataAccessG(StreamG<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc mh){
        list.add(mh);
        stream.addEvent(list);
    }
}
