package elisa.esercizio25;

import java.util.Scanner;

public class Studente {
    private String nome;
    private int matricola;
    int[] voti = new int[5];

    public static int contatoreIndice = 5000;
    private double mediaAcquisita = 0;

    public Studente(){

    }

    public Studente(String nome, int matricola, int[] voti){
        this.nome = nome;
        this.matricola = matricola;
        this.voti = voti;
    }

    public void popolaStudente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome studente: ");
        this.nome = sc.nextLine();
        this.matricola = this.contatoreIndice;
        System.out.println("Matricola: " + this.matricola);
        this.contatoreIndice = this.contatoreIndice + 1;
        System.out.println("Inserire gli ultimi 5 voti compresi tra 18 e 30");
        for(int i = 0; i <= 4;){
            int verificaVoto = sc.nextInt();
            if(verificaVoto < 17){
                System.out.println("Non è possibile inserire un voto insufficiente");
            }else if(verificaVoto > 30){
                System.out.println("Non è possibile inserire un voto superiore a 30");
            }else{
                this.voti[i] = verificaVoto;
                i++;
            }
        }
    }

    public double media(){
        double somma = 0;
        for(int i = 0; i <= 4; i++){
            somma = somma + this.voti[i];
        }
        this.mediaAcquisita = somma/ this.voti.length;
        System.out.println("La media della matricola " + this.matricola + " è: " + this.mediaAcquisita);
        return this.mediaAcquisita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int[] getVoti() {
        return voti;
    }

    public void setVoti(int[] voti) {
        this.voti = voti;
    }

    public static int getContatoreIndice() {
        return contatoreIndice;
    }

    public static void setContatoreIndice(int contatoreIndice) {
        Studente.contatoreIndice = contatoreIndice;
    }

    public double getMediaAcquisita() {
        return mediaAcquisita;
    }

    public void setMediaAcquisita(double mediaAcquisita) {
        this.mediaAcquisita = mediaAcquisita;
    }
}
