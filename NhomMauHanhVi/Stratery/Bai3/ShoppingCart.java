package NhomMauHanhVi.Stratery.Bai3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private IPaymentStrategy paymentStrategy;
    private iShippingStrategy shippingStrategy;
    private IPromotionStrategy promotionStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setShippingStrategy(iShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setPromotionStrategy(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getQuantity() * item.getPrice();
        }
        return totalAmount;
    }

    public double calculatePaymentAmount() {
        double totalAmount = calculateTotalAmount();
        double paymentAmount = paymentStrategy.calculatePaymentAmount(totalAmount);
        return paymentAmount;
    }

    public double calculateShippingFee() {
        double shippingFee = shippingStrategy.calculateShippingFee();
        return shippingFee;
    }

    public int getDeliveryTime() {
        int deliveryTime = shippingStrategy.getDeliveryTime();
        return deliveryTime;
    }

    public double calculateDiscount() {
        double totalAmount = calculateTotalAmount();
        double discount = promotionStrategy.calculateDiscount(totalAmount);
        return discount;
    }

    public double calculateFinalAmount() {
        double totalAmount = calculateTotalAmount();
        double discount = calculateDiscount();
        double paymentAmount = calculatePaymentAmount();
        double shippingFee = calculateShippingFee();
        double finalAmount = totalAmount - discount + shippingFee;
        return finalAmount;
    }

    public void displayCartDetails() {
        System.out.println("========== CART DETAILS ==========");
        for (Item item : items) {
            System.out.println(item.getName() + " x " + item.getQuantity() + " = " + item.getPrice() * item.getQuantity());
        }
        System.out.println("=================================");

        double totalAmount = calculateTotalAmount();
        System.out.println("Total amount: " + totalAmount);

        double discount = calculateDiscount();
        System.out.println("Discount: " + discount);

        double paymentAmount = calculatePaymentAmount();
        System.out.println("Payment amount: " + paymentAmount);

        double shippingFee = calculateShippingFee();
        System.out.println("Shipping fee: " + shippingFee);

        double finalAmount = calculateFinalAmount();
        System.out.println("Final amount: " + finalAmount);

        int deliveryTime = getDeliveryTime();
        System.out.println("Delivery time: " + deliveryTime + " days");
    }

}
