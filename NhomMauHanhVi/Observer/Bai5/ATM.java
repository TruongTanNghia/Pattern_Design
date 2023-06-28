package NhomMauHanhVi.Observer.Bai5;

public class ATM {

    private ITaiKhoanATM taiKhoan;

    public void attach(ITaiKhoanATM taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void detach() {
        this.taiKhoan = null;
    }

    private boolean kiemTraTienRut(int soTienRut){
        return this.taiKhoan.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTienRut) {
        if(this.taiKhoan == null)
            System.out.println("Thẻ không tồn tại");
        else if(kiemTraTienRut(soTienRut))
            this.taiKhoan.thongBao(soTienRut, true);
        else this.taiKhoan.thongBao(soTienRut, false);
    }

    public static interface ITaiKhoanATM {
        boolean kiemTraSoDu(int soTienRut);
        void thongBao(int soTienRut, boolean thanhCong);
    }
}
