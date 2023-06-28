package NhomMauHanhVi.Observer.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taikhoan = new TaiKhoan("Nguyễn Tuấn Kiệt", 1000000000, atm);
        taikhoan.duaTheVao();
        atm.rutTien(300000);
        atm.rutTien(100000);
        taikhoan.rutthe();
        atm.rutTien(100000);
    }
}
