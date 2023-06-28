package NhomMauHanhVi.Template.ThucHanh.Bai2;

public class SinhVien {
    private int maSV;
    private String tenSV, ngaySinh, queQuan;

    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Thông Tin Sinh Viên \n" +
                "Mã Sinh Viên=" + maSV +
                ", Tên Sinh Viên='" + tenSV + '\'' +
                ", Ngày Sinh ='" + ngaySinh + '\'' +
                ", Quê Quán='" + queQuan + '\'' +
                '\n';
    }
}
