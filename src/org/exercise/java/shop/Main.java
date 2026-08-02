package org.exercise.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Carrello mioCarrello = new Carrello();
        String tesserato;
        Scanner scan = new Scanner(System.in);
        
        mioCarrello.startShopping(scan);

        // controlliamo gli elementi nel carrello
        System.out.println(mioCarrello);

        // // test di stampa del prezzo con e senza la card per controllare il corretto funzionamento
        // System.out.println("prezzo senza card:" + mioCarrello.getTotale());   
        // mioCarrello.setIsTesserato(true);
        // System.out.println("prezzo con card:" + mioCarrello.getTotale());

        System.out.println("sei parte del programma fidelity card S/N: ");
        tesserato = scan.nextLine();
        if (tesserato.toUpperCase().equals("S")) {
            mioCarrello.setIsTesserato(true);
        }
        else if (tesserato.toUpperCase().equals("N")) {
            mioCarrello.setIsTesserato(false);
        }
        else {
            System.out.println("Tessera non valida, si considererà come non tesserato!");
            mioCarrello.setIsTesserato(false);
        }
        
        System.out.println("il totale per la sua spesa è: " + mioCarrello.getTotale());
        scan.close();
    }
}
