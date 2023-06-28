package NhomMauHanhVi.Observer.ThucHanh.TroChoi;

public class Drashboard implements IDrashboard{
    private IPlayerData playerData;

    public void attach(IPlayerData playerData) {
        this.playerData = playerData;
    }

    public void detach() {
        this.playerData = null;
    }

    @Override
    public void capnhat() {
        playerData.capNhat();
    }

    public static interface IPlayerData{
        void capNhat();
    }
}
