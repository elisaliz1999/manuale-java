package elisa;

import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        /*
        *Scrivere un programma che chiede all'utente di inserire 7 numeri interi tra
            1 e 30 che corrispondono ai voti ottenuti
            agli esami da 7 studenti.
            Scrive poi sullo schermo il voto più alto e il voto più basso .
            Variante: riesci a farlo usando solo 3 variabili intere (oltre allo Scanner) ?
        * */
        System.out.println("Inserisci 7 numeri da 1 a 30, che corrispondono ai voti ottenuti in università");
        Scanner sc = new Scanner(System.in);
        int[] voti = new int[0];
        int min = 30;
        int max = 1;
        for(int i = 0; i < 8; i++){
            int verificaVoti= sc.nextInt();
            if(verificaVoti > 0 && verificaVoti < 31){
                voti[i] = verificaVoti;
                i++;
                if(voti[i] < min){
                    min = voti[i];
                } else if (voti[i] > max) {
                    max = voti[i];
                }
            }else{
                System.out.println("Inserire un voto valido");
            }
            System.out.println(voti[i]);
        }
        System.out.println("Il voto più basso è " + min);
        System.out.println("Il voto più alto è " + max);
    }
}
