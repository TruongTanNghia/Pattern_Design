package NhomMauCauTruc.Decorator_pattern;

public class Milk extends CondimentDecorater{
    public Milk(Beverage beverage,String description) {
        super(beverage,description);
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
