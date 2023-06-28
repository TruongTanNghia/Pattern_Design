package NhomMauCauTruc.Decorator_pattern;

public abstract class CondimentDecorater extends Beverage{
    Beverage beverage;


    public CondimentDecorater(Beverage beverage,String description) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " " + this.description;
    }
}
