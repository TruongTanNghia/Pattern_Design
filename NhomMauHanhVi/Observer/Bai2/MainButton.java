package NhomMauHanhVi.Observer.Bai2;

public class MainButton {
    public static void main(String[] args) {
        Activity activity = new Activity();
        Button button1 = new Button("Button 1", activity);
        Button button2 = new Button("Button 2", activity);

        activity.addButton(button1);
        activity.addButton(button2);

        button1.click();
        button2.click();
        button1.click();
    }
}
