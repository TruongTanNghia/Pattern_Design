package NhomMauKhoiTao.factory.Bai3;

public abstract class Shape {
    String brush;
    String paper;
    String frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public abstract String draw();
}

