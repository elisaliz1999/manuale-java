package elisa;

import java.util.Scanner;

public class Calcolatrice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Benvenuto nella calcolatrice di Elisa !");
        System.out.println("Per fare la somma premere 1;");
        System.out.println("Per fare la sottrazione premere 2;");

        System.out.println("Per uscire dalla calcolatrice premere 0");

        int scelta = 23;

        while (scelta != 0) {

            scelta = sc.nextInt();

            switch (scelta) {

                case 1:
                    somma();
                    break;
                case 2:
                    sottrazione();
                    break;
                case 0:
                    System.out.println("Arrivederci !");
                    break;
            }
        }
    }

    public static void sottrazione() {
        System.out.println("sottrazione");
    }

    public static void somma(){
        System.out.println("Inserisci i valori da sommare.");
        System.out.println("Potrai sommare tutti i numeri che vorrai...");
        System.out.println("Finché non premerai 0...");
        System.out.println("A quel punto potrai scegliere un'altra operazione");


        int somma = 0;
        boolean exit = true;
        while (exit){
            int a = sc.nextInt();

        }
    }

}
