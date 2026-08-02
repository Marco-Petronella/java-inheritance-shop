package org.exercise.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    public String dimensione;
    public boolean isSmart;

    public Televisore(String nome, String marca, String dimensione, boolean isSmart) {
        super(nome, marca);
        this.dimensione = dimensione;
        this.isSmart = isSmart;
    }

    
    public Televisore(String nome, String marca, BigDecimal prezzo, int iva, String dimensione, boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.isSmart = isSmart;
    }
    public String getDimensione() {
        return dimensione;
    }

    protected void setImei(String dimensione) {
        this.dimensione = dimensione;
    }

    public boolean getIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return String.format("code: %s , %s %s , price: %s + iva %d, dimensioni: %s , smart: %s", codice, nome, marca,
                prezzo, iva, dimensione, isSmart);
    }
}
