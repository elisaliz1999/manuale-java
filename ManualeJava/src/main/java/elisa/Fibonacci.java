package elisa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero e vedrai a schermo quale numero occupa quella posizione nella sequenza di Fibonacci...");
        int posizione = 0;
        int nuovoTermine = 1;
        int ultimo = 1;
        int penultimo = 1;
        while (posizione <= 2){
            System.out.println("Il numero deve essere maggiore di 2");
            Scanner sc = new Scanner(System.in);
            posizione = sc.nextInt();
        }
        for(int i = 2; i < posizione; i++){
            nuovoTermine = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = nuovoTermine;
            System.out.println(nuovoTermine);
        }
    }
}
