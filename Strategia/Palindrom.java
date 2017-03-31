package Strategia;

/**
 * Created by Cyprian on 2017-03-15.
 */
public class Palindrom {

    public boolean isPalindrom(String word){

        StringBuilder wordAsStringBuffer = new StringBuilder(word);
        StringBuilder reversedWord = wordAsStringBuffer.reverse();
        if(reversedWord.toString().equals(word)){
            return true;
        }
        return false;


    }
}
