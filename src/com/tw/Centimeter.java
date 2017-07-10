package com.tw;

public class Centimeter {

    private int amount;

    public Centimeter(int amount) {

        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        return amount == that.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Centimeter times(int multiplier) {
        return new Centimeter(this.amount * multiplier);
    }
}
