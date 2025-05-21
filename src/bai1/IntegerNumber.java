package bai1;


public class IntegerNumber extends bai1.MyNumber {
    int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    public IntegerNumber add(IntegerNumber other) {
        return new IntegerNumber(this.value + other.value);
    }

    public IntegerNumber subtract(IntegerNumber other) {
        return new IntegerNumber(this.value - other.value);
    }

    public IntegerNumber multiply(IntegerNumber other) {
        return new IntegerNumber(this.value * other.value);
    }

    public IntegerNumber divide(IntegerNumber other) {
        return new IntegerNumber(this.value / other.value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
