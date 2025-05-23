package ASM4;
public class ElectronicProduct extends Product {
    private int warrantyMonths; // Số tháng bảo hành

    // Gọi hàm tạo cha và thêm bảo hành
    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    // Ghi đè hàm getInfo để thêm bảo hành
    @Override
    public String getInfo() {
        return super.getInfo() + ", Bảo hành: " + warrantyMonths + " tháng";
    }

    // Nếu giá > 10 triệu thì giảm 10%
    @Override
    public double calculateDiscountedPrice() {
        if (getPrice() > 10000000) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
