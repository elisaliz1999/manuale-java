package EsercizioInterfacce;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quale merendina vuoi mangiare oggi?");
        String n = sc.nextLine();
        System.out.println("Va bene!! Di che marca è?");
        String m = sc.nextLine();
        System.out.println("Bene! Quanto costa?");
        int c = sc.nextInt();


        Merendina merendina = new Merendina(n, m, c);
        System.out.println(merendina.toString());

        System.out.println("Ti va di cucinare un ciambellone?");
        System.out.println("Che tipo di ciambellone vorresti preparare?");
        sc.nextLine(); // Essendoci il nextInt() subito sopra, il 'ritorno a capo' non è letto dal metodo e viene preso dal successivo nextLine() che memorizza quindi una stringa vuota
        String nc = sc.nextLine();
        System.out.println("Va bene...");
        System.out.println("scrivi qui la lista degli ingredienti, uno alla volta");
        System.out.println("Una volta scritta tutta la lista degli ingredienti, premere x");

        ArrayList<String> ingr = new ArrayList<>();
        String condizioneUscita = "t";
        while(!condizioneUscita.equals("x")){
            String elemento = sc.nextLine();
            if(!elemento.equals("x") ){
                ingr.add(elemento);
            }else {
                condizioneUscita = elemento;
            }
        }

        Ciambellone ciambellone= new Ciambellone(nc, ingr.toArray(new String[0]));// converto un ArrayList in array
        System.out.println(ciambellone.descrizione());
    }
}
