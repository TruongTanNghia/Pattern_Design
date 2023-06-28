package NhomMauHanhVi.Template.ThucHanh.Bai3;

public class SortProductByPrice extends SortCollection<Product> {
    @Override
    protected int compare(Product t1, Product t2) {
        return Integer.compare(t1.getPrice(), t2.getPrice());
    }
}

