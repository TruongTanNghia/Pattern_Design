package NhomMauKhoiTao.Builderpattern.Bai1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private List<CTHD> cthds;
    public HoaDon(Builder b){
        this.header = b.header;
        this.cthds = b.cthds;
    }
    static class Builder{
        private HoaDonHeader header;
        private List<CTHD> cthds = new ArrayList<>();
        public HoaDon build(){
            return new HoaDon(this);
        }
        public Builder setHeader(String maHD, String ngayBan, String tenKH) {
            header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau){
            cthds.add(new CTHD(sanPham, soLuong,donGia,chietKhau));
            return this;
        }

    }

    @Override
    public String toString() {
        StringBuilder hd = new StringBuilder();
        hd.append(header.toString());
        hd.append("\n");
        cthds.forEach(cthd -> hd.append(cthd.toString()).append("\n"));
        return hd.toString();
    }

    //    public HoaDonHeader getHeader() {
//        return header;
//    }
//
//    public List<CTHD> getCthdList() {
//        return cthdList;
//    }
//
//    public static class Builder {
//        private HoaDonHeader header;
//        private List<CTHD> cthdList;
//
//        public Builder() {
//            cthdList = new ArrayList<>();
//        }
//
//        public Builder addHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
//            header = new HoaDonHeader();
//            header.setMaHD(maHoaDon);
//            header.setNgayBan(ngayBan);
//            header.setTenKH(tenKhachHang);
//            return this;
//        }
//
//        public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
//            CTHD cthd = new CTHD();
//            cthd.setSanPham(sanPham);
//            cthd.setSoLuong(soLuong);
//            cthd.setDonGia(donGia);
//            cthd.setChietKhau(chietKhau);
//            cthdList.add(cthd);
//            return this;
//        }
//
//        public HoaDon build() {
//            return new HoaDon(this);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "HoaDon:" +
//                "\n" + header +
//                "\nCTHD: " + cthdList;
//    }
}