package Responsibility.ThucHanh;

public interface iRutTienATM {
    iRutTienATM menhGiaKeTiep(iRutTienATM rutTienATM);
    void rutTien(int soTien);
}
// Trong mẫu này luôn có phuương thức thiết lập cái nào cao hơn
// Mệnh giá kế tiếp:
// input: IRutTienATM
// Output: IRutTienATM
// Rút Tiền
// input: Số Tiền
// Output: In ra màn hình số tờ