package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.XepLoaiHocLuc;

public interface IXepLoaiHocLuc {
    IXepLoaiHocLuc hocLucCaoHon (IXepLoaiHocLuc xepLoaiHocLuc);
    String xepLoai(double Diem);
}
