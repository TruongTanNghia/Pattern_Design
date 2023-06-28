package NhomMauKhoiTao.factory.Bai3;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape rectangle = factory.createShape(ShapeType.Rectangle, "chì", "Trắng", "Không có");
        System.out.println(rectangle.draw());

        Shape circle = factory.createShape(ShapeType.Circle, "Mực", "Xanh lá", "Gỗ");
        System.out.println(circle.draw());

        Shape triangle = factory.createShape(ShapeType.Triangle, "Máy", "Vàng", "Nhựa Mica");
        System.out.println(triangle.draw());

    }
}
