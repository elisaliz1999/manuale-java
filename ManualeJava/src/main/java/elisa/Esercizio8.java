package elisa;

public class Esercizio8 {


    public static void main(String[] args) {
        //questo esercizio stamperà tutte le coppie di numeri possibili tra 1 e 5

        stampaCoppie();
    }



    public static void stampaCoppie(){
        int max =5;

        for (int index = 1; index <= max; index++) {


            for (int i = 1; i <= max; i++) {
                System.out.println(index + " "  + i);

            }

        }
    }
}
