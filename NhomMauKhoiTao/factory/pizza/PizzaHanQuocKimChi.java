package NhomMauKhoiTao.factory.pizza;

public class PizzaHanQuocKimChi extends Pizza{
    @Override
    public void prepare() {
        description.append("Kim Chi và Bột Bánh\n");
    }

    @Override
    public void bake() {
        description.append("Nướng trong lò chiên không dầu\n");
    }

    @Override
    public void cut() {
        description.append("Cắt nhỏ\n");
    }

    @Override
    public void box() {
        description.append("Gói giấy bạc\n");
    }
}
