package com.tw;

public class Meter {
    public double amount;

    public Meter(int amount) {
        this.amount = amount;
    }

    public Meter(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;
        Double abs = Math.abs(meter.amount - amount);
        return Double.compare(abs, 0.000001) <= 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Meter{" +
                "amount=" + amount +
                '}';
    }

    public Meter times(int multiplier) {
        return new Meter(this.amount * multiplier);
    }

    public Meter plus(Meter meter) {
        return new Meter(this.amount + meter.amount);
    }
}
