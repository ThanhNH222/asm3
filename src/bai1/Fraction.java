package bai1;
public class Fraction extends bai1.MyNumber {
    int tuso;   // tử số
    int mauso;  // mẫu số

    public Fraction(int tu, int mau) {
        this.tuso = tu;
        this.mauso = mau;
        simplify();
    }

    // Rút gọn phân số
    void simplify() {
        int ucln = gcd(tuso, mauso);
        tuso = tuso / ucln;
        mauso = mauso / ucln;
    }

    // Tìm ước chung lớn nhất
    int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public Fraction add(Fraction other) {
        int tuMoi = this.tuso * other.mauso + other.tuso * this.mauso;
        int mauMoi = this.mauso * other.mauso;
        return new Fraction(tuMoi, mauMoi);
    }

    public Fraction subtract(Fraction other) {
        int tuMoi = this.tuso * other.mauso - other.tuso * this.mauso;
        int mauMoi = this.mauso * other.mauso;
        return new Fraction(tuMoi, mauMoi);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.tuso * other.tuso, this.mauso * other.mauso);
    }

    public Fraction divide(Fraction other) {
        return new Fraction(this.tuso * other.mauso, this.mauso * other.tuso);
    }

    public String toString() {
        if (mauso == 1) return tuso + ""; // Nếu là số nguyên
        return tuso + "/" + mauso;
    }
}