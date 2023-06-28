package NhomMauHanhVi.Observer.Bai1;

import java.util.List;

public class MainStreamG {
    public static void main(String[] args) {
        StreamG<List<MonHoc>> streamG = new StreamG<List<MonHoc>>();
        DataAccessG dataAccessG = new DataAccessG(streamG);
        ClientG<List<MonHoc>> clientG = new
            ClientG<List<MonHoc>>(streamG) {
            @Override
            public void handle(List<MonHoc> monHocs) {
                for(var mh: monHocs)
                    System.out.println(mh.toString());
            }
        };
        System.out.println("================================== LẦN 1 ================================== ");
        dataAccessG.add(new MonHoc("011", "Mẫu thiết kế",3));
        System.out.println("================================== LẦN 2 ================================== ");
        dataAccessG.add(new MonHoc("012","Lập trình thiết bị di động",3));
    }
}
