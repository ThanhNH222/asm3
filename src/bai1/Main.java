package bai1;

public class Main {
    public static void main(String[] args) {
        // Làm việc với số nguyên
        bai1.IntegerNumber a = new bai1.IntegerNumber(10);
        bai1.IntegerNumber b = new bai1.IntegerNumber(3);

        bai1.IntegerNumber tong = a.add(b);
        bai1.IntegerNumber hieu = a.subtract(b);

        System.out.println("Số nguyên:");
        System.out.println(a + " + " + b + " = " + tong);
        System.out.println(a + " - " + b + " = " + hieu);

        // Làm việc với phân số
        bai1.Fraction f1 = new bai1.Fraction(1, 2);
        bai1.Fraction f2 = new bai1.Fraction(1, 3);

        bai1.Fraction tongPhanSo = f1.add(f2);
        bai1.Fraction thuongPhanSo = f1.divide(f2);

        System.out.println("\nPhân số:");
        System.out.println(f1 + " + " + f2 + " = " + tongPhanSo);
        System.out.println(f1 + " / " + f2 + " = " + thuongPhanSo);
    }
}