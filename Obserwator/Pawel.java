package Obserwator;

/**
 * Created by Cyprian on 2017-03-16.
 */
public class Pawel implements Obserwator, WyswietlStan {


    public void wyswietl() {
        System.out.println("wyswietlam stan");
    }

    public void aktualizacjaDanych(boolean stan) {
        System.out.println("Pawel");
        System.out.println("Niezla laska to moja zona");
        if(stan==true){
            System.out.println("Dobrze ciagle ejst ze mna");
        }else{
            System.out.println("Zostawila mnie pinda!");
        }
    }
}
