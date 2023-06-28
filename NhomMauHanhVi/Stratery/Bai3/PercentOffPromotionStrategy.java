package NhomMauHanhVi.Stratery.Bai3;

public class PercentOffPromotionStrategy implements IPromotionStrategy{
    private double percentOff;

    public PercentOffPromotionStrategy(double percentOff) {
        this.percentOff = percentOff;
    }

    public double calculateDiscount(double amount) {
        return amount * percentOff / 100;
    }
}