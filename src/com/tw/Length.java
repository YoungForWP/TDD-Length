package com.tw;

public class Length {
    public double amount;
    private String kind;

    public Length(double amount, String kind) {
        this.amount = amount;
        this.kind = kind;
    }

    public static Length meter(int amount) {
        return new Length(amount, "M");
    }

    public static Length meter(double amount) {
        return new Length(amount, "M");
    }

    public static Length centimeter(int amount) {
        return new Length(amount, "CM");
    }

    public static Length centimeter(double amount) {
        return new Length(amount, "CM");
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;

        Length length = (Length) o;
        Double abs = Math.abs(length.amount - amount);
        return Double.compare(abs, 0.000001) <= 0;
    }

    @Override
    public String toString() {
        return "Length{" +
                "amount=" + amount +
                ", kind='" + kind + '\'' +
                '}';
    }

    public Length times(int multiplier) {
        return new Length(this.amount * multiplier, this.kind);
    }

    public Length plus(Length length) {
        return new Length(this.amount + length.amount, this.kind);
    }
}
