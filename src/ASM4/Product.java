package ASM4;
public class Product {
    private String productId;  // Mã sản phẩm (ví dụ: "P01")
    private String name;       // Tên sản phẩm (ví dụ: "Áo thun")
    private double price;      // Giá sản phẩm (ví dụ: 200000)

    // Hàm tạo để gán giá trị khi tạo đối tượng
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter và Setter: Dùng để lấy và thay đổi giá trị của các biến private
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Hàm in thông tin sản phẩm
    public String getInfo() {
        return "Mã: " + productId + ", Tên: " + name + ", Giá: " + price;
    }

    // Hàm tính giá sau giảm (mặc định không giảm)
    public double calculateDiscountedPrice() {
        return price;
    }
}
