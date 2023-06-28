package NhomMauCauTruc.Decorator_pattern;

public class Soy extends CondimentDecorater{

    public Soy(Beverage beverage,String description) {
        super(beverage,description);
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

}
