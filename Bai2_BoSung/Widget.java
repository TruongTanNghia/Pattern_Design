package Bai2_BoSung;

public abstract class Widget {
    String nameWidget;

    public Widget(String nameWidget) {
        this.nameWidget = nameWidget;
    }

    abstract void hienThi();
}
