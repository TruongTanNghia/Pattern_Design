package NhomMauHanhVi.Stratery.duck_cntt;

public class MainDuck {
    public static void main(String[] args) {
        Duck d = new VitBau();
        d.setQuackBehavior(new SQuack());
        d.setFlyBehavior(new FlyWithWings());
        d.display();

        System.out.println("\n");

        Duck d2 = new VitQuay();
        d2.setQuackBehavior(new MuteQuack());
        d2.setFlyBehavior(new FlyNoWay());
        d2.display();
    }
}
