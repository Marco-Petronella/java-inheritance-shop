package org.exercise.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    protected int codice;
    public String nome;
    public String marca;
    public BigDecimal prezzo;
    public int iva;
    private Random rand = new Random();
    public Prodotto(String nome, String marca, BigDecimal prezzo, int iva) {
        this.codice = rand.nextInt(99999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    public Prodotto(String nome, String marca) {
        this.codice = rand.nextInt(99999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = new BigDecimal(0);
        this.iva = 0;
    }
    public int getCodice() {
        return codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }
    public BigDecimal getPrezzoFidelity() {
        return prezzo.multiply(BigDecimal.valueOf( 0.98));
    }
    @Override
    public String toString() {
        return String.format("code: %s , %s %s , price: %s + iva %d", codice, nome, marca, prezzo, iva);    
    }
}
