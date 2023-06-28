package NhomMauKhoiTao.factory.pizza;

public class PizzaVietNamMamNem extends Pizza{

    @Override
    public void prepare() {
        description.append("Mắm Nêm đến từ Cà Mau và Bột bánh Pizza\n");
    }

    @Override
    public void bake() {
        description.append("Nướng trên lò đất nung!\n");
    }

    @Override
    public void cut() {
        description.append("Cắt hình tròn\n");
    }

    @Override
    public void box() {
        description.append("Đóng hộp hình Mắm Mêm Cà Mau\n");
    }
}
