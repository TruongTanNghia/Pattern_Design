package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.DoVeSo;

import java.util.Arrays;

public interface IDoVeSo {
    IDoVeSo giaiThuongKeTiep(IDoVeSo keTiep);
    String doVe(String so);
}
