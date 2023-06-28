package NhomMauHanhVi.Observer.Bai1_ThaySua;
import java.util.ArrayList;
import java.util.List;
public class Client implements Stream.Listener<List<String>> {
    private List<String> data;

    public Client(Stream<List<String>> stream) {
        stream.registerListener(this);
        this.data = new ArrayList<>();
    }

    @Override
    public void onEvent(List<String> event) {
        this.data.clear();
        this.data.addAll(event);
        displayData();
    }

    private void displayData() {
        System.out.println("List of courses:");
        for (String course : data) {
            System.out.println(course);
        }
        System.out.println();
    }
}
