package BaiTapMoDau.bt5;

public class hocsinh extends canhan {
    private String lop;
    private String nangKhieu;

    public hocsinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return "Ho ten: " + this.getHoTen() + ", tuoi: " + this.getTuoi() + ", dia chi: " + this.getDiaChi() +
                ", sdt: " + this.getSdt() + ", lop: " + this.getLop() + ", nang khieu: " + this.getNangKhieu();
    }
}


