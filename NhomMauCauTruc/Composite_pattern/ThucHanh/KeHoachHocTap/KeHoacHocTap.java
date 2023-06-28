package NhomMauCauTruc.Composite_pattern.ThucHanh.KeHoachHocTap;

public abstract class KeHoacHocTap {
    public abstract String getMonHoc();
    public abstract int getoTC();
    public abstract int getHocPhi();

    public abstract void add(KeHoacHocTap keHoacHocTap);
}
