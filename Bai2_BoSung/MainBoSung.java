package Bai2_BoSung;

public class MainBoSung {
    public static void main(String[] args) {
        Widget text = new WidgetCoBan("Text");
        Widget container = new ContainerWidget("Container", text);
        container.hienThi();
    }
}
