package NhomMauHanhVi.Stratery.Bai3;

public class GiaoHangNhanhShippingStrategy implements iShippingStrategy {
    public double calculateShippingFee() {
        return 20000;
    }

    public int getDeliveryTime() {
        return 4;
    }
}

