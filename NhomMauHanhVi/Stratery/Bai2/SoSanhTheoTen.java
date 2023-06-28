package NhomMauHanhVi.Stratery.Bai2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.hoTen.compareTo(o2.hoTen);
    }
}
