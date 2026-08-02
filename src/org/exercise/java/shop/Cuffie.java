package org.exercise.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    public String colore;
    public Boolean isWireless;

    public Cuffie(String nome, String marca, String colore, boolean isWireless) {
        super(nome, marca);
        this.colore = colore;
        this.isWireless = isWireless;
    }
        public Cuffie(String nome, String marca, BigDecimal prezzo, int iva, String colore, boolean isWireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getcolore() {
        return colore;
    }

    protected void setcolore(String colore) {
        this.colore = colore;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return String.format("code: %s , %s %s , price: %s + iva %d, colore: %s , isWireless: %s", codice, nome, marca,
                prezzo, iva, colore, isWireless);
    }
}
