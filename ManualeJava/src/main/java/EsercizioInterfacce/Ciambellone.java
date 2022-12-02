package EsercizioInterfacce;

public class Ciambellone extends Dolce{
    private String[] ingredienti;


    public Ciambellone(String nome, String[] ingredienti) {
        super(nome);
        this.ingredienti = ingredienti;
    }

    @Override
    public String descrizione() {
        String des = "Per fare il dolce " + getNome() + " ci vogliono i seguenti ingredienti: " ;
        for(int i = 0; i < ingredienti.length; i++){
            des = des + "\n" + ingredienti[i];
        }
        return des;
    }
}
