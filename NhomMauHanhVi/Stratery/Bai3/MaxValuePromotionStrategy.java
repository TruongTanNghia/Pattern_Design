package NhomMauHanhVi.Stratery.Bai3;

public class MaxValuePromotionStrategy implements IPromotionStrategy {
    private double maxValue;
    private double percentOff;

    public MaxValuePromotionStrategy(double maxValue, double percentOff) {
        this.maxValue = maxValue;
        this.percentOff = percentOff;
    }

    public double calculateDiscount(double amount) {
        if (amount * percentOff / 100 > maxValue) {
            return maxValue;
        } else {
            return amount * percentOff / 100;
        }
    }
}
