package Obserwator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2017-03-16.
 */
public class NiezlaLaska implements Podmiot {

    private List<Obserwator> listaObserwatorow;
    private boolean stan;

    public NiezlaLaska() {
        listaObserwatorow = new ArrayList<Obserwator>();
    }

    public void dodajObserwatora(Obserwator obserwator){
        listaObserwatorow.add(obserwator);
        System.out.println("Dodaje obserwatora");
    }
    public void usunObserwatora(Obserwator obserwator){
        listaObserwatorow.remove(obserwator);
        System.out.println("Usuwam obserwatora");
    }
    public void powiadomObserwatorow(){
        System.out.println("aktualizuje dane");
        for (Obserwator obserwator : listaObserwatorow) {
            obserwator.aktualizacjaDanych(stan);
        }
    }

    public void ustawStanLaski(Boolean stan){
        this.stan=stan;
        powiadomObserwatorow();
    }
}
