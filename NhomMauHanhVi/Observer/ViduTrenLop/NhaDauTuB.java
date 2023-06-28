package NhomMauHanhVi.Observer.ViduTrenLop;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public void CapNhatTiGia(float delta) {
        if(delta>0){
            System.out.println("B Ban ra");
        }else{
            if(delta==0){
                System.out.println("B Mua vao");
            }else{
                System.out.println("B Mua vao");
            }
        }
    }
}
