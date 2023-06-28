package NhomMauHanhVi.Observer.Bai4;

import java.util.List;

public class ThanhVienB implements Topic.I_ThanhVien {
    private List<String> messages;

    public ThanhVienB(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void capNhat(List<String> messages) {
        this.messages = messages;
        System.out.println("Thành viên B nhận được danh sách tin nhắn mới:");
        for (int i = 0; i < messages.size(); i++) {
            System.out.println((i+1) + ". " + messages.get(i));
        }
    }
}

