import COSE.CoseException;
import com.google.iot.cbor.CborParseException;
import com.google.zxing.NotFoundException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    /**
     * Ci andremo a recuperare le singole cifre del pin a quattro numeri in questo modo:
     * 1-
     *
     * @param args
     * @throws IOException
     * @throws NotFoundException
     * @throws CoseException
     * @throws CborParseException
     * @throws DataFormatException
     */
    public static void main(String[] args) throws IOException, NotFoundException, CoseException, CborParseException, DataFormatException {
        int pin = (int) (Math.random() * (9999 - 1000)) + 1000;
        String ultime_quatr_cifre = String.valueOf(pin);
        ultime_quatr_cifre = ultime_quatr_cifre.substring(ultime_quatr_cifre.length() - 4, ultime_quatr_cifre.length());
        pin = Integer.parseInt(ultime_quatr_cifre);
        System.out.println("Ciao, prova ad indovinare un pin di 4 cifre. Hai 10 tentativi");
        List<Tentativo> tentativoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci il " + (i + 1) + " Tentativo");
            Tentativo t = new Tentativo();
            t = eseguiTentativo(pin);
            if (t.getInput_utente() == pin) {
                System.out.println("Cazzo c'hai azzeccato");
                return;
            } else {
                tentativoList.add(t);
                System.out.println("Input utente: " + t.getInput_utente());
                System.out.println("cifre nella posizione corretta: " + t.getCifre_pos_corretta());
                System.out.println("cifre corrette in posizioni sbagliate: " + t.getCifre_corr_pos_sbalgiate() + "\n\n");
            }
        }
        System.out.println();
        System.out.println("Ecco i tuoti risultati");
        System.out.println("pin segreto: " + pin);
        System.out.println();
        System.out.println();
        for (Tentativo tent : tentativoList) {
            System.out.println("Input utente: " + tent.getInput_utente());
            System.out.println("cifre nella posizione corretta: " + tent.getCifre_pos_corretta());
            System.out.println("cifre corrette in posizioni sbagliate: " + tent.getCifre_corr_pos_sbalgiate() + "\n\n");
        }
    }

    /**
     * @param pin_segreto
     * @return
     */
    public static Tentativo eseguiTentativo(int pin_segreto) {
        Scanner scanner = new Scanner(System.in);
        int num_utente = 999;
        System.out.println("inserisci una cifra di 4 numeri");
        System.out.println("se inserisci un numero piu grande verranno prese in considerazione solo le ultime 4 cifre come pin");
        while (num_utente < 1000) {
            num_utente = scanner.nextInt();
            if (num_utente < 1000) {
                System.out.println("Devi inserire un numero di 4 cifre (Maggiore di 1000)");
            }
        }
        Tentativo tentativo = new Tentativo();
        tentativo.setInput_utente(num_utente);
        int[] array_pin_segreto = {ritornaPrimaPosizione(pin_segreto), ritornaSecondaPosizione(pin_segreto), ritornaTerzaPosizione(pin_segreto), ritornaQuartaPosizione(pin_segreto)};
        int[] arra_pin_utente = {ritornaPrimaPosizione(num_utente), ritornaSecondaPosizione(num_utente), ritornaTerzaPosizione(num_utente), ritornaQuartaPosizione(num_utente)};
        for (int i = 0; i < array_pin_segreto.length; i++) {
            if (arra_pin_utente[i] == array_pin_segreto[i]) {
                tentativo.setCifre_pos_corretta(tentativo.getCifre_pos_corretta() + 1);
            } else {
                for (int j = 0; j < arra_pin_utente.length; j++) {
                    if (j != i) {
                        if (arra_pin_utente[i] == array_pin_segreto[j]) {
                            tentativo.setCifre_corr_pos_sbalgiate(tentativo.getCifre_corr_pos_sbalgiate() + 1);
                        }
                    }
                }
            }
        }
        return tentativo;
    }

    /**
     * @param pin
     * @return
     */
    public static int ritornaPrimaPosizione(int pin) {
        return pin / 1000;
    }

    /**
     * @param pin
     * @return
     */
    public static int ritornaSecondaPosizione(int pin) {
        return (pin / 100) % 10;
    }

    /**
     * @param pin
     * @return
     */
    public static int ritornaTerzaPosizione(int pin) {
        return (pin / 10) % 10;
    }

    /**
     * @param pin
     * @return
     */
    public static int ritornaQuartaPosizione(int pin) {
        return pin % 10;
    }
}
