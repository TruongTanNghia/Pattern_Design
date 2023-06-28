package NhomMauHanhVi.Template.ThucHanh.Bai2;

public class SinhVienDB extends EnityDB<SinhVien>{
    @Override
    public int getKey(SinhVien sinhVien) {
        return sinhVien.getMaSV();
    }
}
