package Responsibility.Topic_5;

public class NhanVienF88 implements IXuLyKhoanVay{
    String ten, chucVu;
    IXuLyKhoanVay sep;
    int max;

    public NhanVienF88(String ten, String chucVu, int max) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.max = max;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay handler) {
        sep = handler;
        return handler;
    }

    @Override
    public String xuLy(int tienVay) {
        if(tienVay <= max)
            return chucVu + " " + ten + " chịu trách nhiệm cho vay!!";
        else
            return sep.xuLy(tienVay);
    }
}
