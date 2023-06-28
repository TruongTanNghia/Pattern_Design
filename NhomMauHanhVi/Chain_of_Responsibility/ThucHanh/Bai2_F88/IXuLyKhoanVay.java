package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.Bai2_F88;

public interface IXuLyKhoanVay{
    IXuLyKhoanVay capCaoHon(IXuLyKhoanVay handler);
    String xuLy(int tienVay);
}
