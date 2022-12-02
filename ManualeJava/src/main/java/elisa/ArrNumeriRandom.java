package elisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrNumeriRandom {


    public static void main(String[] args) {
        System.out.println("Inserire valore massimo");
        Scanner sc= new Scanner(System.in);
        int lM = sc.nextInt();
        System.out.println("inserire valore minimo");
        int lm = sc.nextInt();
        System.out.println("inserire la grandezza dell'array");
        int lungArr = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < lungArr; i ++){
           int random = ArrNumeriRandom.getRandomNumberUsingNextInt(lm, lM);
            arr.add(random);
        }
        System.out.println("Questo è l'array di numeri casuali generato");

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }


    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
