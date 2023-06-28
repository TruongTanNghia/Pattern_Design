package BaiTapMoDau.bt4;

public class XeNoiThanh extends ChuyenXe{
    //số tuyến, số km đi được
    int soTuyen, soKm;

    public XeNoiThanh(String maSo, String taiXe, String soXe, int doanhThu, int soTuyen, int soKm) {
        super(maSo, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return " Thông tin chuyến xe Nội thành:" +
                "\nMã số chuyến: " + maSo  +
                "\nHọ tên Tài xế: " + taiXe +
                "\nSố xe " + soXe +
                "\nSố tuyến: " + soTuyen +
                "\nSố Km đi được: " + soKm +
                "\nDoanh thu" + doanhThu ;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
}
