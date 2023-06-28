package NhomMauHanhVi.Observer.Bai1_ThaySua;

public class Main {
    public static void main(String[] args) {
        MonHoc monHoc = new MonHoc();
        Client client = new Client(monHoc.getStream());

        monHoc.addCourse("Toán");
        monHoc.addCourse("Vật Lý");
        monHoc.addCourse("Sinh Học");
        monHoc.updateCourse(0, "Văn");
        //monHoc.deleteCourse(0);
        monHoc.getStream();
    }
}
