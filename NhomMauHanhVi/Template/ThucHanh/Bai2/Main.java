package NhomMauHanhVi.Template.ThucHanh.Bai2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien(1, "nguyền văn a", "Phú Yên", "23-10-2010");
        SinhVien sv1 = new SinhVien(2, "Lê thị na", "Khánh Hòa", "04-12-2010");
        MonHoc mh = new MonHoc(1, 3, "Giải Tích");
        MonHoc mh1 = new MonHoc(2,3 , "Mẫu thiết kế");
        SinhVienDB svdb1 = new SinhVienDB();
        MonHocDB mhdb1 = new MonHocDB();
        svdb1.add(sv);
        svdb1.add(sv1);
        mhdb1.add(mh);
        mhdb1.add(mh1);
        for (var m : mhdb1.list) {
            System.out.println(m.toString());
        }

        mhdb1.update(new MonHoc(2,4 , "Mẫu thiết kế"));
        mhdb1.delete(mh);

        for (var m : mhdb1.list) {
            System.out.println(m.toString());
        }
        mhdb1.delete(mh);
    }
}


