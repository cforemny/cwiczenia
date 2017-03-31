package Strategia;

/**
 * Created by Cyprian on 2017-03-16.
 */
public abstract class Zwierze {

    private WydawanieDzwieku wydawanieDzwieku;

    public Zwierze(WydawanieDzwieku wydawanieDzwieku) {
        this.wydawanieDzwieku = wydawanieDzwieku;
    }

    public void przytulaj (){
        System.out.println("Kazdy zwierzak sie przytula");
    }

    public void wydawajDzwieki(){
        wydawanieDzwieku.wydajDzwiek();
    }
}
