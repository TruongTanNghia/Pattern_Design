package NhomMauKhoiTao.factory.pizza;

public class PizzaVietNamMamTom extends Pizza{
    @Override
    public void prepare() {
        description.append("Mắm Tôm Độc Lạ Bình Dương và Bột Bánh Pizza\n");
    }

    @Override
    public void bake() {
        description.append("Nướng trên lửa than 15p\n");
    }

    @Override
    public void cut() {
        description.append("Cắt thành 10 phần hình tam giác cân\n");
    }

    @Override
    public void box() {
        description.append("Gói hộp lót lá chuối\n");
    }
}
