package BaiTapMoDau.bt3;

public abstract class SinhVienNTU {
    private  String hoTen;
    private String nganh;

    //Constructor có tham số
    public SinhVienNTU(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem() < 5){
            return "Yếu";
        }
        if (getDiem() < 6.5) {
            return "Trung Bình";
        }
        if (getDiem() < 7.5) {
            return "Khá";
        }
        if (getDiem() < 9) {
                return "Giỏi";
            }else
                return "Xuất sắc";
    }
    public void Xuat(){
        System.out.println("\nHọ tên: " + hoTen + "\tNgành Học: " + nganh + "\tĐiểm: " + getDiem() + "\tHọc Lực: " + getHocLuc());
    }
}
