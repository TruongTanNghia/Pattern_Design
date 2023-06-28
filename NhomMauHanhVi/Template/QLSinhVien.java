package NhomMauHanhVi.Template;

public class QLSinhVien extends QLData<SinhVien>{

    @Override
    protected int khoa(SinhVien t) {
        return t.id;
    }

    @Override
    public void hienThi(SinhVien t) {
        System.out.println(t.mssv);
        System.out.println(t.ten);
        System.out.println(t.ngaysinh);
        System.out.println(t.quequan);
    }


}
