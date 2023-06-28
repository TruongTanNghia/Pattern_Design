package BaiTapMoDau.bt1;

public class NhanVien {
    private String ten, diaChi;
    private int tuoi;
    private double tienLuong;
    private int tongSoGioLam;

    // Constructor không tham số
    public NhanVien() {
    }

    // Constructor đầy đủ các tham số
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public double getTienLuong() {
        return tienLuong;
    }
    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
    public int getTongSoGioLam() {
        return tongSoGioLam;
    }
    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    //Các phương thức
    public String getThongTin() {
        return "Tên: " + ten + ", Tuổi: " + tuoi + ", Địa chỉ: " + diaChi + ", Tiền lương: " + tienLuong
                + ", Tổng số giờ làm: " + tongSoGioLam;
    }

    public double tinhThuong() {
        if (tongSoGioLam >= 200) {
            return tienLuong * 0.2;
        } else if (tongSoGioLam >= 100) {
            return tienLuong * 0.1;
        } else {
            return 0;
        }
    }
}
