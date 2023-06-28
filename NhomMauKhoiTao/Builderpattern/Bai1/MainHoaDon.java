package NhomMauKhoiTao.Builderpattern.Bai1;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader("HD001", "21/01/2023", "Hamin")
                .addCTHD("Apple Watch", 1, 1000, 0.5)
                .addCTHD("Macbook", 2, 2000, 0.2)
                .build();
        System.out.println(hoaDon.toString());
    }
}