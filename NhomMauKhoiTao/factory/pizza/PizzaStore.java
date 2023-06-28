package NhomMauKhoiTao.factory.pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType t);
    public Pizza orderPizza(PizzaType t){
        Pizza pizza;
        pizza = createPizza(t);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
