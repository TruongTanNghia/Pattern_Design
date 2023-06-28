package NhomMauCauTruc.Decorator_pattern;

public abstract class Beverage {
    String description;

    public Beverage() {
    }

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int cost();

}
