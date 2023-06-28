package NhomMauKhoiTao.Builderpattern.Bai1;

public class CTHD {
    String sanPham;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return
                this.sanPham + ": "+ "Số lượng: "  + this.soLuong + " Giá: " + donGia + " Chiết khấu: " + this.chietKhau;
    }
}

