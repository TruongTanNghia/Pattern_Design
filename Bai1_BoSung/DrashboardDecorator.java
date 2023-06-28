package Bai1_BoSung;

public abstract class DrashboardDecorator implements IDrashboard{
    IDrashboard drashboard;

    public DrashboardDecorator(IDrashboard drashboard) {
        this.drashboard = drashboard;
    }
}
