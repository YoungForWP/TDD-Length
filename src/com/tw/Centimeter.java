package com.tw;

public class Centimeter {

    private double amount;

    public Centimeter(int amount) {

        this.amount = amount;
    }

    public Centimeter(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        return Double.compare(that.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    public Centimeter times(int multiplier) {
        return new Centimeter(this.amount * multiplier);
    }

    public Centimeter plus(Centimeter centimeter) {
        return new Centimeter(this.amount + centimeter.amount);
    }
}
