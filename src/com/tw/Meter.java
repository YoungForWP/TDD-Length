package com.tw;

public class Meter {
    public int amount;

    public Meter(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        return amount == meter.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Meter times(int multiplier) {
        return new Meter(this.amount * multiplier);
    }

    public Meter plus(Meter meter) {
        return new Meter(this.amount + meter.amount);
    }
}
