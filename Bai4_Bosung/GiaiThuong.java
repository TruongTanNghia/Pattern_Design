package Bai4_Bosung;

public class GiaiThuong implements IDoVeSo{
    String tenGiai;
    String [] soTrung;

    private IDoVeSo giaiThuongKeTiep;

    public GiaiThuong(String tenGiai, String[] soTrung) {
        this.tenGiai = tenGiai;
        this.soTrung = soTrung;
    }

    @Override
    public IDoVeSo giaiThuongKeTiep(IDoVeSo keTiep) {
        this.giaiThuongKeTiep = keTiep;
        return keTiep;
    }

    @Override
    public String doVe(String so) {
        for(String soTrung : soTrung){
            if (soTrung.endsWith(so) )
                return "Bộ số: " + soTrung + " đã trúng giải " + tenGiai;
        }if (giaiThuongKeTiep==null)
            return "Chúc bạn may mắn lần sau!!";
        return giaiThuongKeTiep.doVe(so);
    }
}
