package NhomMauHanhVi.Template.ThucHanh.Bai3;

public class SortProductByName extends SortCollection<Product> {
    @Override
    protected int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
