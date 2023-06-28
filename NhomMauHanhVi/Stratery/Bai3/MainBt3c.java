package NhomMauHanhVi.Stratery.Bai3;

public class MainBt3c {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("IPhone 14 Pro Max", 1, 30990000));
        cart.addItem(new Item("Apple Watch Series 7", 2, 10990000));
        cart.addItem(new Item("AirPods Pro", 1, 5990000));
        cart.setPaymentStrategy(new CODPaymentStrategy());
        cart.setShippingStrategy(new GiaoHangNhanhShippingStrategy());
        cart.setPromotionStrategy(new PercentOffPromotionStrategy(10));
        cart.setPaymentStrategy(new AirpayPaymentStrategy());

        cart.displayCartDetails();
    }
}
