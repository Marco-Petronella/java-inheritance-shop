package org.exercise.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto testProdotto = new Prodotto("ciao", "boh", BigDecimal.valueOf(100), 10);
        System.out.println(testProdotto.toString());
    }
}
