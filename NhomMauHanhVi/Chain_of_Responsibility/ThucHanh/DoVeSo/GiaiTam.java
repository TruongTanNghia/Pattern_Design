package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.DoVeSo;

public class GiaiTam implements IDoVeSo{
    String soTrung;
    String tenGiai;
    @Override
    public IDoVeSo giaiThuongKeTiep(IDoVeSo keTiep) {
        return null;
    }

    @Override
    public String doVe(String so) {
        if (so.endsWith(soTrung))
            return "Bạn đã trúng giải " + tenGiai;
        else
            return  "Bạn không trúng giải thưởng nào!!";
    }
}
