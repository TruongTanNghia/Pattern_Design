package NhomMauHanhVi.Stratery.Bai3;

public class AirpayPaymentStrategy implements  IPaymentStrategy{
    public double calculatePaymentAmount(double amount) {
        if (amount >= 1000000) {
            return amount * 0.97;
        } else {
            return amount;
        }
    }
}


