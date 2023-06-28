package NhomMauHanhVi.Stratery.Bai1;

public class Context {

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    private ITinh tinhToan;
    float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
