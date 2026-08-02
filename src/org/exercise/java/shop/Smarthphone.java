package org.exercise.java.shop;

import java.math.BigDecimal;

public class Smarthphone extends Prodotto {
    public String imei;
    public int memory;

    public Smarthphone(String nome, String marca, String imei, int memory) {
        super(nome, marca);
        this.imei = imei;
        this.memory = memory;
    }
        public Smarthphone(String nome, String marca, BigDecimal prezzo, int iva, String imei, int memory) {
        super(nome, marca, prezzo, iva);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    protected void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    
    @Override
    public BigDecimal getPrezzoFidelity() {
        if (memory < 32) return super.getPrezzoFidelity();
        else return prezzo.multiply(BigDecimal.valueOf( 0.95));
    }

    @Override
    public String toString() {
        return String.format("code: %s , %s %s , price: %s + iva %d, imei: %s , memory: %s", codice, nome, marca,
                prezzo, iva, imei, memory);
    }
}
