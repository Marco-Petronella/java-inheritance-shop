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

        String nome;
        String marca;
        BigDecimal prezzo;
        int iva;
        String readingLine;
        int readingInt;
        Carrello mioCarrello = new Carrello();
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
                if (readingInt != 1 && readingInt != 2 && readingInt != 3) {
                    System.out.println("input per tipo di oggetto non valido");
                } else {
                    // inserisco i parametri comuni per tutti i Prodotti
                    System.out.println("inserisci nome dell'oggetto: ");
                    nome = scan.nextLine();
                    System.out.println("inserisci marca dell'oggetto: ");
                    marca = scan.nextLine();
                    System.out.println("inserisci prezzo senza iva dell'oggetto: ");
                    prezzo = new BigDecimal(scan.nextLine());
                    System.out.println("inserisci IVA (default 22): ");
                    iva = Integer.parseInt(scan.nextLine());

                    if (readingInt == 1) {
                        // inserisco i parametri specifici per le tv
                        System.out.println("Inserisci dimensione della tv: ");
                        String dimensione = scan.nextLine();
                        System.out.println("E' una smart tv (S/N)");
                        readingLine = scan.nextLine();
                        boolean isSmart = false;
                        if (readingLine.toUpperCase().equals("N")) {
                            isSmart = false;
                        } else if (readingLine.toUpperCase().equals("S")) {
                            isSmart = true;
                        }

                        // aggiungo la tv al carrello
                        Televisore newTelevisore = new Televisore(nome, marca, prezzo, iva, dimensione, isSmart);
                        mioCarrello.addAcquisto(newTelevisore);
                    } else if (readingInt == 2) {
                        // inserisco i parametri specifici per gli smartphone
                        System.out.println("Inserisci memoria dello smartphone: ");
                        String memory = scan.nextLine();
                        System.out.println("inserisci codice IMEI: ");
                        String imei = scan.nextLine();

                        // aggiungo lo smartphone al carrello
                        Smarthphone newSmarthphone = new Smarthphone(nome, marca, prezzo, iva, imei, memory);
                        mioCarrello.addAcquisto(newSmarthphone);

                    } else if (readingInt == 3) {
                        // inserisco i parametri specifici per le cuffie
                        System.out.println("Inserisci colore delle cuffie: ");
                        String colore = scan.nextLine();
                        System.out.println("Sono wireless (S/N)");
                        readingLine = scan.nextLine();
                        boolean isWireless = false;
                        if (readingLine.toUpperCase().equals("N")) {
                            isWireless = false;
                        } else if (readingLine.toUpperCase().equals("S")) {
                            isWireless = true;
                        }

                        // aggiungo le cuffie
                        Cuffie newCuffie = new Cuffie(nome, marca, prezzo, iva, colore, isWireless);
                        mioCarrello.addAcquisto(newCuffie);
                    }
                }
            } else {
                System.out.println("Input non valido! Inserisci 'S' per aggiungere articoli o 'N' per terminare");
            }
        }

        System.out.println(mioCarrello);
        scan.close();
    }
}
