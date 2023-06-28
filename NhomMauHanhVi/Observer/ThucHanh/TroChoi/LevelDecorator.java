package NhomMauHanhVi.Observer.ThucHanh.TroChoi;

public class LevelDecorator extends DrashboardDecorator{
    int level;
    String mucThuong;

    public LevelDecorator(IDrashboard drashboard) {
        super(drashboard);
    }


    public void setLevel(int level) {
        this.level = level;
        capnhat();
    }

    public void setMucThuong(String mucThuong) {
        this.mucThuong = mucThuong;
        capnhat();
    }

    @Override
    public void capnhat() {
        drashboard.capnhat();
        System.out.println("Level: " + level + "\nMức thưởng: " + mucThuong);
    }
}
