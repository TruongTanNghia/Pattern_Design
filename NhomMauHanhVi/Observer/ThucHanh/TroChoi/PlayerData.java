package NhomMauHanhVi.Observer.ThucHanh.TroChoi;

public class PlayerData implements Drashboard.IPlayerData {
    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
        drashboard.capnhat();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        drashboard.capnhat();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        drashboard.capnhat();
    }

    private String thoiGian;
    private int countdown;
    private int grade;
    Drashboard drashboard;

    public PlayerData(Drashboard drashboard) {
        this.drashboard = drashboard;
        drashboard.attach(this);
    }


    @Override
    public void capNhat() {
        System.out.println("Thời gian còn lại của trò chơi: " + thoiGian + "\nSố lượt chơi còn lại: " + countdown + "\nĐiểm đạt được: " + grade);
    }
}
