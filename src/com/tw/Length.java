package com.tw;

import java.util.HashMap;

public class Length {
    double amount;
    String kind;

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

    public static Length kilometer(int amount) {
        return new Length(amount, "KM");
    }

    public static Length kilometer(double amount) {
        return new Length(amount, "KM");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;
        Double abs = Math.abs(length.amount - amount);
        if (Double.compare(abs, 0.000001) > 0) return false;
        return kind.equals(length.kind);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + kind.hashCode();
        return result;
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
