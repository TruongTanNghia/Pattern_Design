package BaiTapMoDau.bt3;

public class SinhVienBiz extends SinhVienNTU {
    double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
}
