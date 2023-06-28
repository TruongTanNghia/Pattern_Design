package NhomMauHanhVi.Template.ThucHanh.Bai3;

public class Product {
    private String Name;
    private int Price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        Name = name;
        Price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                ", quantity=" + quantity +
                '}';
    }
}
