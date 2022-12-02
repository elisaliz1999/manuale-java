package elisa;

public class IstruzioneContinue {



    public static void main(String[] args) {
        IstruzioneContinue istruzioneContinue = new IstruzioneContinue();
        istruzioneContinue.trovaIMultipliDi3();
    }

    public void trovaIMultipliDi3(){
        for (int i = 1; i < 10; i++)
        {
            System.out.println( "Iterazione con i = " + i);
            if ( i % 3 != 0 )
            {
                continue;
            }
            System.out.println ("Che e’ un multiplo di 3");
        }
        System.out.println ("Fine del ciclo");
    }


}
