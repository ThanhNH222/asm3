package ASM4;
public class ClothingProduct extends Product {
    private String size; // Kích cỡ (S, M, L...)

    public ClothingProduct(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + size;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85;  // Luôn giảm 15%
    }
}