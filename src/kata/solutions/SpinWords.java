package kata.solutions;

import java.util.Arrays;
import java.util.Iterator;

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