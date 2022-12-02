package EsercizioInterfacce;

import java.util.Scanner;

public abstract class Dolce {
    private String nome;

    public abstract String descrizione();

    @Override
    public String toString() {
        String s = "nome" + nome;
        return s;
    }

    public Dolce(String nome){
        this.nome = nome;
    }

    public Dolce(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
