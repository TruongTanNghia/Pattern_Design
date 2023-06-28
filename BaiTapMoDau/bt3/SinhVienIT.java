package BaiTapMoDau.bt3;

public class SinhVienIT extends SinhVienNTU{
    double diemJava, diemCss, diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava*2 + diemHtml + diemCss)/4;
    }
}
