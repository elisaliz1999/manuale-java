package elisa.esercizio25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Studente studente;
        System.out.println("Inserire numero di studenti dei quali si vuole conoscere la media");
        Scanner sc = new Scanner(System.in);
        int nStud = sc.nextInt();
        List<Studente> studenteList = new ArrayList<>();
        double mediaMaggiore = 0.0;
        Studente studenteMigliore = new Studente();

        for(int i = 1; i <= nStud; i++){
            studente = new Studente();
            studente.popolaStudente();
            studente.media();
            studenteList.add(studente);
            if(studente.getMediaAcquisita() > mediaMaggiore){
                mediaMaggiore = studente.getMediaAcquisita();
                studenteMigliore = studente;
            }

        }
        System.out.println("*****************************\n*****************************\n*****************************\n*****************************");
        System.out.println("Lo studente con la media più alta è " + studenteMigliore.getNome() + "\n matricola " + studenteMigliore.getMatricola() + "\n con una media pari a " + studenteMigliore.getMediaAcquisita() );
    }
}
