package org.exercise.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prodotto testProdotto = new Prodotto("accessorio", "ferrari",
        // BigDecimal.valueOf(100), 10);
        // System.out.println(testProdotto);
        // Smarthphone testSmarthphone = new Smarthphone("3310", "nokia",
        // "454sdada5464", "1000000Gb");
        // System.out.println(testSmarthphone);
        // Televisore testTelevisore = new Televisore("Frame TV", "Samsung",
        // BigDecimal.valueOf(11000), 20, "60 pollici",
        // true);
        // System.out.println(testTelevisore);
        // Cuffie testCuffie = new Cuffie("Kraken", "Razer", "Rainbow", false);
        // System.out.println(testCuffie);
        // Carrello testCarrello = new Carrello();
        // testCarrello.addAcquisto(testTelevisore);
        // testCarrello.addAcquisto(testCuffie);
        // System.out.println(testCarrello);

        String readingLine;
        int readingInt;
        Scanner scan = new Scanner(System.in);
        boolean isShoppingDone = false;
        while (!isShoppingDone) {
            System.out.println("hai articoli da inserire? S/N");
            readingLine = scan.nextLine();
            if (readingLine.toUpperCase().equals("N")) {
                isShoppingDone = true;
            } else if (readingLine.toUpperCase().equals("S")) {
                System.out.println("Scegliere articolo da inserire \n 1) Televisore \n 2) Smartphone \n 3) Cuffie");
                readingInt = Integer.parseInt(scan.nextLine());
                if (readingInt == 1) {
                    System.out.println("aggiungio TV");
                } else if (readingInt == 2) {
                    System.out.println("aggiungo Smartphone");
                } else if (readingInt == 3) {
                    System.out.println("aggiungo cuffie");
                } else {
                    System.out.println("input non valido");
                }
            } else {
                System.out.println("Input non valido! Inserisci 'S' per aggiungere articoli o 'N' per terminare");
            }
        }

        scan.close();
    }
}
