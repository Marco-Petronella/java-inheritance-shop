package org.exercise.java.shop;

public class Smarthphone extends Prodotto {
    public String imei;
    public String memory;

    public Smarthphone(String nome, String marca, String imei, String memory) {
        super(nome, marca);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    protected void setImei(String imei) {
        this.imei = imei;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("code: %s , %s %s , price: %s + iva %d, imei: %s , memory: %s", codice, nome, marca,
                prezzo, iva, imei, memory);
    }
}
