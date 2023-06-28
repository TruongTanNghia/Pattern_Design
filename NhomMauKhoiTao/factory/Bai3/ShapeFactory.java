package NhomMauKhoiTao.factory.Bai3;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape(ShapeType type, String brush, String paper, String frame) {
        switch (type) {
            case Rectangle:
                return new Rectangle(brush, paper, frame);
            case Circle:
                return new Circle(brush, paper, frame);
            case Triangle:
                return new Triangle(brush, paper, frame);
            default:
                throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}



