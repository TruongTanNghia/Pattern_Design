package NhomMauHanhVi.Template.ThucHanh.Bai1;

import Responsibility.ThucHanh.MenhGia;

import java.util.ArrayList;
import java.util.List;

public class MatHang {
    List<MatHang> DsMatHang =  new ArrayList<>();
    String Ten;
    float gia;
    int soLuong;

    public MatHang(String ten, float gia, int soLuong) {
        Ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {

        return "MatHang: " + Ten + "\n Soluong: " + soLuong + "\n Gia: " + gia;
    }
    float getThanhTien(){
        return  soLuong*gia;
    }
}
