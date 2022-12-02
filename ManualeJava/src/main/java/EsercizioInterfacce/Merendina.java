package EsercizioInterfacce;

public class Merendina extends Dolce {
    private String marca;
    private int costo;

    public Merendina(String nome, String marca, int costo) {
        super(nome);
        this.marca = marca;
        this.costo = costo;
    }

    public Merendina(){

    }


    @Override
    public String descrizione() {

        return "nome: " + getNome() + "\nmarca: " + this.marca + "\ncosto: " + this.costo;
    }

    @Override
    public String toString(){
        return this.descrizione();// entra dentro il metodo e si prende la stringa creata, poi stampa la stringa ricevuta
    }
}
