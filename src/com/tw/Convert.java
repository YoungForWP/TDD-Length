package com.tw;

import java.util.HashMap;

public class Convert {

    HashMap<Pair, Double> rates = new HashMap<>();

    public void initRates() {
        rates.put(new Pair("M", "MM"), 1000.0);
        rates.put(new Pair("CM", "MM"), 10.0);
        rates.put(new Pair("KM", "MM"), 1000000.0);
        rates.put(new Pair("MM", "MM"), 1.0);
    }

    public Length convert(Length length, String toKind) {
        double rateFromSourceToMM = rates.get(new Pair(length.kind, "MM"));
        double rateFromDestinationToMM = rates.get(new Pair(toKind, "MM"));
        double amount = length.amount * (rateFromSourceToMM / rateFromDestinationToMM);
        return new Length(amount, toKind);
    }
}
