package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai2_F88;

public class TongGiamDocF88 implements IXuLyKhoanVay{
    String ten;
    int max;

    public TongGiamDocF88(String ten, int max) {
        this.ten = ten;
        this.max = max;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay handler) {
        return null;
    }

    @Override
    public String xuLy(int tienVay) {
        if(tienVay<=max)
            return "Tổng giám đốc chịu trách nhiệm cho vay!!";
        else
            return "Không cho vay đâuu bạn ơiii, bạn trông thiếu uy tín quá";
    }
}
