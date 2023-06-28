package NhomMauHanhVi.Stratery.Bai3;

public class CODPaymentStrategy implements IPaymentStrategy {
    public double calculatePaymentAmount(double amount) {
        if (amount >= 2000000) {
            return amount * 0.98;
        } else {
            return amount;
        }
    }
}