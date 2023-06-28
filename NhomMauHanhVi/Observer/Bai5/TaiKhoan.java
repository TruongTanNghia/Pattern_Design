package NhomMauHanhVi.Observer.Bai5;

public class TaiKhoan implements ATM.ITaiKhoanATM{
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVao() {
        atm.attach(this);
    }

    public void rutthe() {
        atm.detach();
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soTienRut > soDu)
        return false;
        else return true;
    }

    @Override
    public void thongBao(int soTienRut, boolean thanhCong) {
        System.out.println("Tên tài khoản: "+ this.ten);
        if(thanhCong) {
            System.out.println("Số dư ban đầu:" + this.soDu);
            this.soDu = this.soDu - soTienRut;
            System.out.println("Đã rút: " + soTienRut );
            System.out.println("Số dư hiện tại: " + this.soDu);
            System.out.println("=============================");
        }
        else System.out.println("Giao dịch không thành công");
    }
}
