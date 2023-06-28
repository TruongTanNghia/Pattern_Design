package NhomMauHanhVi.Stratery.duck_cntt;

public class MuteQuack implements IQuackBehavior{
    @Override
    public String quack() {
        return "AHHHH tui không biết kêu";
    }
}
