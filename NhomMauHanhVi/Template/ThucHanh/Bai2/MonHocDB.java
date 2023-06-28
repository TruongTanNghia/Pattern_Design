package NhomMauHanhVi.Template.ThucHanh.Bai2;

public class MonHocDB extends EnityDB<MonHoc>{
    @Override
    public int getKey(MonHoc monHoc) {
        return monHoc.getMaMH();
    }
}
