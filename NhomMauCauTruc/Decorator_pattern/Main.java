package NhomMauCauTruc.Decorator_pattern;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage b = new DarkRoast("Cà Phê Siêu Cấp Vipro");
        b = new Soy(b, "\n + Sửa Đặc");
        b = new Milk(b, "\n + Sửa Ông thọ");
        Beverage c = new Decaf("Cà Phê Decaf");
        c = new Soy(c, "\n + Sửa Đặc");
        c = new Milk(c, "\n + Sửa Ông Thọ");
        System.out.println(b.getDescription());
        System.out.println("Tổng buil là: " + b.cost());
        System.out.println(c.getDescription());
        System.out.println("Tổng Buil là: " + c.cost());
    }
}
