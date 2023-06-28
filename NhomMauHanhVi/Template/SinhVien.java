package NhomMauHanhVi.Template;

public class SinhVien {
    int id;
    String mssv, ten, ngaysinh, quequan;

    public SinhVien(int id, String mssv, String ten, String ngaysinh, String quequan) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public int getId() {
        return id;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

}