package ASM4;
import java.util.ArrayList;
public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        // Thêm sản phẩm vào danh sách
        products.add(new ElectronicProduct("E01", "Tivi Sony", 12000000, 24));
        products.add(new FoodProduct("F01", "Sữa tươi", 30000, 2));
        products.add(new FoodProduct("F02", "Bánh mì", 15000, 5));
        products.add(new ClothingProduct("C01", "Áo thun", 200000, "M"));

        // Duyệt và in thông tin từng sản phẩm
        for (Product p : products) {
            System.out.println(p.getInfo());  // Thông tin sản phẩm
            System.out.println("Giá sau giảm: " + p.calculateDiscountedPrice()); // Giá sau giảm
            System.out.println("-----------------------");
        }
    }
}