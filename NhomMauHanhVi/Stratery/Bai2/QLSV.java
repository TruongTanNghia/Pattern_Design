package NhomMauHanhVi.Stratery.Bai2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {

    List<SinhVien>  svs = new ArrayList<>();

    public List<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(List<SinhVien> svs) {
        this.svs = svs;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    ISoSanh<SinhVien> soSanh;
    public void sapXep(){
        svs.sort((o1, o2) -> soSanh.soSanh(o1,o2) );
    }
    public void inDS(){
        for(SinhVien sv:svs){
            System.out.println(sv.toString());
        }
    }
    public void themSinhVien(SinhVien sv){
        svs.add(sv);
    }
}
