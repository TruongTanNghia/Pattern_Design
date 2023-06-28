package NhomMauHanhVi.Observer.Bai1;


public class MainStream {
    public static void main(String[] args) {
        Stream stream = new Stream();
        DataAccess dataAccess = new DataAccess(stream);
        Client client = new Client(stream);
        System.out.println("========================================== Lần 1 ==========================================");
        dataAccess.add(new MonHoc("01","Tư tưởng Hồ Chí Minh", 3));
        System.out.println("========================================== Lần 2 ==========================================");
        dataAccess.add(new MonHoc("02", "Cấu trúc dữ liệu và giải thuât", 3));
    }
}

