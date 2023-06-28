package NhomMauHanhVi.Observer.Bai4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<I_ThanhVien> thanhVien = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    public void dangKyThanhVien(I_ThanhVien thanhvien) {
        thanhVien.add(thanhvien);
    }

    public void xoaThanhVien(I_ThanhVien thanhvien) {
        thanhVien.remove(thanhvien);
    }

    public void AddTinNhan(String message) {
        messages.add(message);
        notifyThanhVien();
    }

    public void UpdateTinNhan(int index, String message) {
        messages.set(index, message);
        notifyThanhVien();
    }

    private void notifyThanhVien() {
        for (I_ThanhVien thanhvien : thanhVien) {
            thanhvien.capNhat(messages);
        }
    }

    public static interface I_ThanhVien{
        void capNhat(List<String> messages);
    }
}

