public class Esercizio_3a {

    public static void divisione(){
        int a = 5;
        int b = 3;
        double r1 = (double)a/b;
        System.out.println("ESERCIZIO 3a\ndivisone tra due interi (3 e 5) con risultato in una variabile di tipo double");
        System.out.println(r1);
    }

    public static void motiplicazione(){
        char c = 'a';
        short s = 5000;
        int r2 =  c*s;
        System.out.println("moltiplicazione tra un char 'a' e uno short 5000, risultato in int");
        System.out.println(r2);
    }

    public static void somma() {
        int i = 6;
        float f = 3.14F;
        float r3 = i+f;
        System.out.println("somma tra un int 6 e un float 3.14, risultato in float");
        System.out.println(r3);
    }

    public static void sottrazione() {
        double r1 = 1.6666666666666667;
        int r2 = 485000;
        float r3 = 9.14F;
        double r4 = r1-r2-r3;
        System.out.println("sottrazione tra tutti i risultati precedenti, castati a double");
        System.out.println(r4);
    }
}
