package ASM3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] ds = new Vehicle[3];

        // Tạo xe máy
        Motorbike xeMay = new Motorbike();
        xeMay.setLicensePlate("59A1-12345");
        xeMay.setBrand("Honda");
        xeMay.setEngineCapacity(160);
        ds[0] = xeMay;

        // Tạo ô tô
        Car oTo = new Car();
        oTo.setLicensePlate("51B-67890");
        oTo.setBrand("Toyota");
        oTo.setSeatNumber(7);
        ds[1] = oTo;

        // Tạo xe tải
        Truck xeTai = new Truck();
        xeTai.setLicensePlate("50C-99999");
        xeTai.setBrand("Isuzu");
        xeTai.setLoadCapacity(8.5);
        ds[2] = xeTai;

        int soGio = 3; // Số giờ gửi

        for (Vehicle v : ds) {
            System.out.println(v.toString());
            System.out.println("Phí gửi " + soGio + " giờ: " + v.tinhPhiGuiXe(soGio) + " đồng");
            System.out.println("--------------------------");
        }
    }
}