package Strategia;

/**
 * Created by Cyprian on 2017-03-15.
 */
public class PrimaryNumber {


    public boolean isPrimary(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
