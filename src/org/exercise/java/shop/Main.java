package org.exercise.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto testProdotto = new Prodotto("accessorio", "ferrari", BigDecimal.valueOf(100), 10);
        // System.out.println(testProdotto);

        Smarthphone testSmarthphone = new Smarthphone("3310", "nokia", "454sdada5464", "1000000Gb");
        // System.out.println(testSmarthphone);

        Televisore testTelevisore = new Televisore("Frame TV", "Samsung", BigDecimal.valueOf(11000), 20, "60 pollici", true);
        // System.out.println(testTelevisore);

        Cuffie testCuffie = new Cuffie("Kraken", "Razer", "Rainbow", false);
        // System.out.println(testCuffie);

        Carrello testCarrello = new Carrello();
        testCarrello.addAcquisto(testTelevisore);
        testCarrello.addAcquisto(testCuffie);
        System.out.println(testCarrello);
    }
}
