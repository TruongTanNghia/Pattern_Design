package NhomMauKhoiTao.factory.Bai3;
public class Triangle extends Shape {
    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        // Vẽ hình tam giác
        return "Vẽ hình tam giác với: " + "Bút " + brush + ", Giấy " + paper + ", Khung " + frame;
    }
}

