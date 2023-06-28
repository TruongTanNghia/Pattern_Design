package NhomMauHanhVi.Template.Vidu;

public class MySinhVienDB extends ObjectDB<MySinhVien> {

    @Override
    public int getID(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
}
