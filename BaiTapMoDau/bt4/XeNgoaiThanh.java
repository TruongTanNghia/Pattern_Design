package BaiTapMoDau.bt4;

public class XeNgoaiThanh extends ChuyenXe {
    // nơi đến, số ngày đi được
    String noiDen;
    int soNgay;

    public XeNgoaiThanh(String maSo, String taiXe, String soXe, int doanhThu, String noiDen, int soNgay) {
        super(maSo, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return " Thông tin chuyến xe Ngoại Thành:" +
                "\nMã số chuyến: " + maSo  +
                "\nHọ tên Tài xế: " + taiXe +
                "\nSố xe: " + soXe +
                "\nNơi đến: " + noiDen +
                "\nSố ngày đi được: " + soNgay +
                "\nDoanh thu: " + doanhThu ;
    }


    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
}
