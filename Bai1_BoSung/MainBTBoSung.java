package Bai1_BoSung;

public class MainBTBoSung {
    public static void main(String[] args) {
        IDrashboard drashboard = new Drashboard();
        PlayerData playerData = new PlayerData((Drashboard) drashboard);
        playerData.setThoiGian("Thời gian còn lại của trò chơi: 10 phút");
        IDrashboard drashboard1 = new LevelDecorator(drashboard);
        ((LevelDecorator) drashboard1).setLevel(1);
        ((LevelDecorator) drashboard1).setMucThuong("10.000 exp");
        ((LevelDecorator) drashboard1).setLevel(2);
        ((LevelDecorator) drashboard1).setMucThuong("20.000 exp");

    }
}
