package NhomMauKhoiTao.factory.pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore store1 = new PizzaVietNamStore();
        PizzaStore store2 = new PizzaHanQuocStore();
        
        Pizza pizza = store1.orderPizza(PizzaType.MamTom);
        System.out.println(pizza.toString());
        Pizza pizza1 = store1.orderPizza(PizzaType.MamNem);
        System.out.println(pizza1.toString());

        Pizza pizza2 = store2.orderPizza(PizzaType.KimChi);
        System.out.println(pizza2.toString());
    }
}
