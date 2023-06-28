package BaiTapMoDau.bt5;

public class giaovien extends canhan{
    private String monDay;
    private String toBoMon;

    public giaovien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT(){
        return "Ho ten: " + this.getHoTen() + ", tuoi: " + this.getTuoi() + ", dia chi: " + this.getDiaChi() +
                ", sdt: " + this.getSdt() + ", mon day: " + this.getMonDay() + ", to bo mon: " + this.getToBoMon();
    }

}
