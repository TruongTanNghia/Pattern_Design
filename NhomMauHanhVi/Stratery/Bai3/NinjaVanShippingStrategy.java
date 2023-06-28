package NhomMauHanhVi.Stratery.Bai3;

public class NinjaVanShippingStrategy implements iShippingStrategy {
    public double calculateShippingFee() {
        return 25000;
    }

    public int getDeliveryTime() {
        return 5;
    }
}