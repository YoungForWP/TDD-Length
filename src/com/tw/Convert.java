package com.tw;

import java.util.HashMap;

public class Convert {

    HashMap<Pair, Double> rates = new HashMap<>();

    public void initRates() {
        rates.put(new Pair("M", "MM"), 1000.0);
        rates.put(new Pair("CM", "MM"), 10.0);
    }

    public Length convert(Length length, String toKind) {
        double amount;
        double rateFromMToMM = rates.get(new Pair("M", "MM"));
        double rateFromCMToMM = rates.get(new Pair("CM", "MM"));

        if(length.kind.equals("M") && toKind.equals("CM")){
            amount = length.amount * (rateFromMToMM / rateFromCMToMM);
        }else {
            amount = length.amount  * (rateFromCMToMM / rateFromMToMM);
        }
        return new Length(amount, toKind);
    }
}
