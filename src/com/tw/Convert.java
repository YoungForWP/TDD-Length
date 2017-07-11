package com.tw;

import java.util.HashMap;

public class Convert {

    HashMap<Pair, Double> rates = new HashMap<>();

    public void initRates() {
        rates.put(new Pair(Kind.M, Kind.MM), 1000.0);
        rates.put(new Pair(Kind.CM, Kind.MM), 10.0);
        rates.put(new Pair(Kind.KM, Kind.MM), 1000000.0);
        rates.put(new Pair(Kind.MM, Kind.MM), 1.0);
    }

    public Length convert(Length length, Kind kind) {
        double rateFromSourceToMM = rates.get(new Pair(length.kind, Kind.MM));
        double rateFromDestinationToMM = rates.get(new Pair(kind, Kind.MM));
        double amount = length.amount * (rateFromSourceToMM / rateFromDestinationToMM);
        return new Length(amount, kind);
    }
}
