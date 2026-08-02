package org.exercise.java.shop;

public class Carrello {
    Prodotto[] acquisti = new Prodotto[0];

    public Prodotto[] getProdotto() {
        return acquisti;
    }

    public void addAcquisto(Prodotto newItem) {
        Prodotto[] newAcquisti = new Prodotto[acquisti.length+1];
        for (int i=0; i<acquisti.length; i++) {
            newAcquisti[i] = acquisti[i];
        }
        newAcquisti[acquisti.length] = newItem;
        acquisti = newAcquisti;
        System.out.println("Prodotto aggiunto");
    }

    @Override 
    public String toString() {
        for (int i=0; i<acquisti.length; i++) {
            System.out.println(acquisti[i].toString());
        }
        return "ciao";
    }
}
