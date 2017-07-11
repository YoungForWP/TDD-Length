package com.tw;

public class Convert {

    public Length convert(Length length, String toKind) {
        double amount = length.amount * 100;
        return new Length(amount, toKind);
    }
}
