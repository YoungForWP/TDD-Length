package com.tw;

import java.util.HashMap;

public class Length {
    double amount;
    Kind kind;

    public Length(double amount, Kind kind) {
        this.amount = amount;
        this.kind = kind;
    }

    public static Length meter(int amount) {
        return new Length(amount, Kind.M);
    }

    public static Length meter(double amount) {
        return new Length(amount, Kind.M);
    }

    public static Length centimeter(int amount) {
        return new Length(amount, Kind.CM);
    }

    public static Length centimeter(double amount) {
        return new Length(amount, Kind.CM);
    }

    public static Length kilometer(int amount) {
        return new Length(amount, Kind.KM);
    }

    public static Length kilometer(double amount) {
        return new Length(amount, Kind.KM);
    }

public static Length millimeter(int amount) {
        return new Length(amount, Kind.MM);
    }

    public static Length millimeter(double amount) {
        return new Length(amount, Kind.MM);
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
        Convert convert = new Convert();
        convert.initRates();
        return new Length(this.amount + convert.convert(length, this.kind).amount, this.kind);
    }
}
