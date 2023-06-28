package NhomMauKhoiTao.factory.Bai3;
public class Circle extends Shape {
    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        // Vẽ hình tròn
        return "Vẽ hình tròn với: " + "Bút " + brush + ", Giấy " + paper + ", Khung " + frame;
    }
}
