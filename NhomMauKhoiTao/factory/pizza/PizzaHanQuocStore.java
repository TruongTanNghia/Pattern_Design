package NhomMauKhoiTao.factory.pizza;

public class PizzaHanQuocStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType t) {
        if(t == PizzaType.KimChi)
            return new PizzaHanQuocKimChi();
        return null;
    }
}
