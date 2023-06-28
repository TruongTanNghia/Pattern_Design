//Observer
package NhomMauHanhVi.Observer.Bai2;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private List<Button> buttons = new ArrayList<>();
    private int clickCount = 0;

    public void addButton(Button button) {
        buttons.add(button);
    }

    public void notifyClick(String buttonName) {
        clickCount++;
        System.out.println("Bạn click lần thứ " + clickCount + " vào button " + buttonName);
    }
}
