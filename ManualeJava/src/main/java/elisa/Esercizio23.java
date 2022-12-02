package elisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizio23 {



    public static void main(String[] args) {
        System.out.println("inserire la dimensione dell'array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("popolare l'array");
        List<Integer> arr = new ArrayList<>();


        for(int i = 0; i < n; i ++){
            int x = sc.nextInt();
            arr.add(x);
           // System.out.println(x);

        }
        Esercizio23.contaOccorrenze(arr);

    }

    public static int contaOccorrenze(List<Integer>arr){
        System.out.println("inserire il numero che si vuole cercare all'interno dell'array");
        Scanner sc2 =new Scanner(System.in);
        int nDaRicercare = sc2.nextInt();
        int count = 0;

        for(int index = 0; index < arr.size(); index++){
            if(nDaRicercare == arr.get(index)){
                count++;
            }
        }
        System.out.println("Questo numero appare " + count + " volte");
        return count;
    }

}
