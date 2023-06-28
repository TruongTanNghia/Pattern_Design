package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.XepLoaiHocLuc;

public class XepLoaiHocLuc implements IXepLoaiHocLuc{
    double diem;
    int  max;
    String xeploai;

    public XepLoaiHocLuc(int max, String xeploai) {
        this.max = max;
        this.xeploai = xeploai;
    }

    private IXepLoaiHocLuc hocLucCaoHon;
    @Override
    public IXepLoaiHocLuc hocLucCaoHon(IXepLoaiHocLuc xepLoaiHocLuc) {
        this.hocLucCaoHon = xepLoaiHocLuc;
        return xepLoaiHocLuc;
    }

    @Override
    public String xepLoai(double Diem) {
        if(diem<=max)
            return xeploai;
        else
           return hocLucCaoHon.xepLoai(diem);
    }
}
