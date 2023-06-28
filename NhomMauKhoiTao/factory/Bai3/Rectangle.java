package NhomMauKhoiTao.factory.Bai3;

public class Rectangle extends Shape {
    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        // Vẽ hình chữ nhật
        return "Vẽ hình chữ nhật với: " + "Bút " + brush + ", Giấy " + paper + ", Khung " + frame;
    }
}
