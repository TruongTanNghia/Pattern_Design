package NhomMauHanhVi.Observer.Bai4;

import java.util.ArrayList;
import java.util.List;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();

        ThanhVienA tvA = new ThanhVienA();
        topic.dangKyThanhVien(tvA);

        List<String> initialMessages = new ArrayList<>();
        initialMessages.add("Message 1: ");
        initialMessages.add("Message 2: ");
        initialMessages.add("Message 3: ");

        ThanhVienB tvB = new ThanhVienB(initialMessages);
        topic.dangKyThanhVien(tvB);

        topic.AddTinNhan("Chào các bạn");
        topic.AddTinNhan("chào mừng đến với NTU");
        topic.AddTinNhan("Chuẩn bị vào tham quan trương");

        topic.UpdateTinNhan(1, "Đã mở cổng");
    }
}
