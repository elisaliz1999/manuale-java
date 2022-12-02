package elisa;

import java.util.Scanner;

public class EsercizioExtra05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        EsercizioExtra05 esercizioExtra05 = new EsercizioExtra05();
        esercizioExtra05.tabellina();

    }

    public static void tabellina(){
        int n = 0;
        int d = 0;

        while(!(n >= 1 && n <= 10)){
            System.out.println("inserisci un numero da 1 a 10 e ti farò la tabellina");
            n = sc.nextInt();
        }
        System.out.println("Bene! Adesso dimmi come vuoi visualizzare la tabellina...");

        while(d == 0){
            System.out.println("Digita un qualsiasi numero maggiore di 0 per vederla in ordine CRESCENTE");
            System.out.println("Digita un qualsiasi numero minore di 0 per vederla in ordine DECRESCENTE");
            d = sc.nextInt();
        }

        if(d > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }else{
            for(int j = 10; j >= 1; j--){
                System.out.println(n * j);
            }
        }
    }



}
