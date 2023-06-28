package NhomMauHanhVi.Observer.Bai4;

import java.util.List;

public class ThanhVienA implements Topic.I_ThanhVien {
    @Override
    public void capNhat(List<String> messages) {
        String latestMessage = messages.get(messages.size() - 1);
        System.out.println("Thành viên A đã nhận một tin nhắn mới : " + latestMessage);
    }
}
