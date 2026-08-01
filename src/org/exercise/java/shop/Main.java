package org.exercise.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto testProdotto = new Prodotto("ciao", "boh", BigDecimal.valueOf(100), 10);
        System.out.println(testProdotto.toString());
        Smarthphone testSmarthphone = new Smarthphone("3310", "nokia", "454sdada5464", "1000000Gb");
        System.out.println(testSmarthphone.toString());
    }
}
