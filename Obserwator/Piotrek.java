package Obserwator;

/**
 * Created by Cyprian on 2017-03-16.
 */
public class Piotrek implements Obserwator, WyswietlStan {


    public void wyswietl() {
        System.out.println("wyswietlam stan");
    }
    public void aktualizacjaDanych(boolean stan) {
        System.out.println("Piotrek");
        if(stan==true){
            System.out.println("Kiedy w koncu bedzie wolna?");
        }else{
            System.out.println("Wolna, biore sie za nia!");
        }
    }
}
