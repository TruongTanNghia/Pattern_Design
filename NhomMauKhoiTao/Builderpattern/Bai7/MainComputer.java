package NhomMauKhoiTao.Builderpattern.Bai7;

public class MainComputer {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .buildCPU("Core i9 13987")
                .buildRAM("64GB RAM Samsung 3600MHz")
                .buildStorage("1TB SSD Samsung Evo 1200")
                .buildScreen("OLED 100% NTSC")
                .build();
        System.out.println(c.toString());
    }
}
