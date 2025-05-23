package ASM4;
public class FoodProduct extends Product {
    private int expiryDays; // Số ngày còn lại trước khi hết hạn

    public FoodProduct(String productId, String name, double price, int expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Hạn còn lại: " + expiryDays + " ngày";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (expiryDays <= 3) {
            return getPrice() * 0.7;  // Giảm 30%
        } else if (expiryDays <= 7) {
            return getPrice() * 0.9;  // Giảm 10%
        }
        return getPrice();  // Không giảm
    }
}

