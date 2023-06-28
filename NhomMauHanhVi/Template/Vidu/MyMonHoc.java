package NhomMauHanhVi.Template.Vidu;

public class MyMonHoc {
    private int maMH;
    private String tenMH;
    private int soTC;

    public MyMonHoc(int maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return "====== Môn học ======" +
                "\nMã môn học: " + maMH +
                "\nTên môn học: " + tenMH +
                "\nSố tín chỉ: " + soTC;
    }
}
