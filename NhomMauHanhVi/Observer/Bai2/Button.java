//Subject
package NhomMauHanhVi.Observer.Bai2;

public class Button {
    private String name;
    private Activity activity;

    public Button(String name, Activity activity) {
        this.name = name;
        this.activity = activity;
    }

    public void click() {
        activity.notifyClick(name);
    }
}


