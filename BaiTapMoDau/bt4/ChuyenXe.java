package BaiTapMoDau.bt4;

public class ChuyenXe {
    //Mã số chuyến, Họ tên tài xế, số xe, doanh thu
    String maSo, taiXe, soXe;
    int doanhThu;

    public ChuyenXe(String maSo, String taiXe, String soXe, int doanhThu) {
        this.maSo = maSo;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}
