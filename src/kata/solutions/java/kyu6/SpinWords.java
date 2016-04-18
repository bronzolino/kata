package kata.solutions.java.kyu6;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Stop gninnipS My sdroW!
 * 
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (Just like the
 * name of this Kata). Strings passed in will consist of only letters and
 * spaces. Spaces will be included only when more than one word is present.
 * 
 * Examples:
 * 
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {

    public String spinWords(String sentence) {
        StringBuilder sbi = new StringBuilder();
        Iterator<String> it = Arrays.asList(sentence.split(" ")).iterator();
        while (it.hasNext()) {
            String word = it.next();
            if (word.length() < 5) sbi.append(word);
            else sbi.append(new StringBuilder(word).reverse().toString());
            if (it.hasNext()) sbi.append(" ");
        }
        return sbi.toString();
    }
}