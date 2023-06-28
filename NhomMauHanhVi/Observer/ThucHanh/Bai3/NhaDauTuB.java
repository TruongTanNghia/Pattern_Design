package NhomMauHanhVi.Observer.ThucHanh.Bai3;

//import Observer.ViduTrenLop.TiGia;

public class NhaDauTuB implements Tigia.I_TheoDoiTiGia {
    Tigia t;
    public NhaDauTuB(Tigia t){
        this.t = t;
        t.attach(this);
    }
    public void HuyDangKy(){
        System.out.println("Nhà Đầu Tư B Đã Huỷ Phiên Giao Dịch");
        t.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta>0){
            System.out.println("Nhà Đầu Tư B bán ra");
        }
        else {
            System.out.println("Nhà Đầu Tư B mua vào");
        }
    }
}
