package NhomMauHanhVi.Template.ThucHanh.Bai2;

public class MonHoc {
    int maMH,soTC;
    String tenMH;

    @Override
    public String toString() {
        return "Danh Sách Môn Học\n" +
                "Mã Môn Học=" + maMH +
                ", Số Tín Chỉ =" + soTC +
                ", Tên Môn Học='" + tenMH + '\'' +
                '\n';
    }

    public MonHoc(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
}
