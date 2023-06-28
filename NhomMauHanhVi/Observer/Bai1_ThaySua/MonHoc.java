package NhomMauHanhVi.Observer.Bai1_ThaySua;

import java.util.ArrayList;
import java.util.List;
public class MonHoc {
    private Stream<List<String>> stream;
    private List<String> courses;

    public MonHoc() {
        this.stream = new Stream<>();
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.courses.add(course);
        this.stream.addEvent(this.courses);
    }

    public void updateCourse(int index, String course) {
        this.courses.set(index, course);
        this.stream.addEvent(this.courses);
    }

    public void deleteCourse(int index) {
        this.courses.remove(index);
        this.stream.addEvent(this.courses);
    }

    public Stream<List<String>> getStream() {
        return stream;
    }
}
