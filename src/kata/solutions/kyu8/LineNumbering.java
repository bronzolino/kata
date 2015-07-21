package kata.solutions.kyu8;

/**
 *
 * Testing 1-2-3 8KYU (BETA)
 * 
 * Your team is writing a fancy new text editor and you've been tasked with
 * implementing the line numbering.
 * 
 * Write a function which takes a list of strings and returns each line
 * prepended by the correct number.
 * 
 * Examples
 * 
 * number(Arrays.asList()) # => []
 * number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
 */
import java.util.*;

class LineNumbering {

    static List<String> number(List<String> lines) {
        int cnt = 0;
        List<String> resultList = new ArrayList<>();
        Iterator<String> it = lines.iterator();
        while (it.hasNext()) resultList.add(++cnt + ": " + it.next());
        return resultList;
        // TODO
    }

}