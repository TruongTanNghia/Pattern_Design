package NhomMauHanhVi.Template.ThucHanh.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Muối", 100000, 10));
        productList.add(new Product("Đường", 50000, 5));
        productList.add(new Product("Bột Ngọt", 70000, 7));

        System.out.println("\nDANH SÁCH SẢN PHẨM CHƯA SẮP XẾP:");
        for (Product C : productList) {
            System.out.println(C);
        }

        // Sắp xếp danh sách sản phẩm theo tên sản phẩm
        SortCollection<Product> sorter = new SortProductByName();
        sorter.sort(productList);

        // In ra danh sách sản phẩm đã sắp xếp theo tên của sản phẩm
        System.out.println("\nDanh sách sản phẩm sắp xếp theo tên sản phẩm:");
        for (Product p : productList) {
            System.out.println(p);
        }
        // Sắp xếp danh sách sản phẩm theo giá sản phẩm
        sorter = new SortProductByPrice();
        sorter.sort(productList);
        // In ra danh sách sản phẩm đã sắp xếp theo giá của sản phẩm
        System.out.println("\nDanh sách sản phẩm sắp xếp theo giá sản phẩm:");
        for (Product p : productList) {
            System.out.println(p);
        }

    }

}
