package org.exercise.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    Prodotto[] acquisti = new Prodotto[0];
    Boolean isTesserato = false;

    public Prodotto[] getProdotto() {
        return acquisti;
    }

    public void setIsTesserato(boolean tesserato) {
        isTesserato = tesserato;
    }

    public boolean getIsTesserato() {
        return isTesserato;
    }

    public void addAcquisto(Prodotto newItem) {
        Prodotto[] newAcquisti = new Prodotto[acquisti.length + 1];
        for (int i = 0; i < acquisti.length; i++) {
            newAcquisti[i] = acquisti[i];
        }
        newAcquisti[acquisti.length] = newItem;
        acquisti = newAcquisti;
        System.out.println("Prodotto aggiunto");
    }

    public BigDecimal getTotale() {
        BigDecimal totale = new BigDecimal(0);
        for (int i = 0; i < acquisti.length; i++) {
            if (isTesserato) totale = totale.add(acquisti[i].getPrezzoFidelity());
            else totale = totale.add(acquisti[i].getPrezzo());
        }
        return totale;
    }

    public void startShopping(Scanner scan) {
        String nome;
        String marca;
        BigDecimal prezzo;
        int iva;
        String readingLine;
        int readingInt;
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
                        addAcquisto(newTelevisore);
                    } else if (readingInt == 2) {
                        // inserisco i parametri specifici per gli smartphone
                        System.out.println("Inserisci memoria dello smartphone in GB: ");
                        int memory = Integer.parseInt(scan.nextLine());
                        System.out.println("inserisci codice IMEI: ");
                        String imei = scan.nextLine();

                        // aggiungo lo smartphone al carrello
                        Smarthphone newSmarthphone = new Smarthphone(nome, marca, prezzo, iva, imei, memory);
                        addAcquisto(newSmarthphone);

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
                        addAcquisto(newCuffie);
                    }
                }
            } else {
                System.out.println("Input non valido! Inserisci 'S' per aggiungere articoli o 'N' per terminare");
            }
        }
    }


    @Override
    public String toString() {
        String returningString = "";
        for (int i = 0; i < acquisti.length; i++) {
            if (i > 0)
                returningString += "\n";
            returningString = returningString += acquisti[i].toString();
        }
        return returningString;
    }
}
