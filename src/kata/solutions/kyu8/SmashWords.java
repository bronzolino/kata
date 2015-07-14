package kata.solutions.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Sentence Smash 8 KYU
 * 
 * Write a method smash that takes an array of words and smashes them together
 * into a sentence and returns the sentence. You can ignore any need to sanitize
 * words or add punctuation, but you should add spaces between each word. Be
 * careful, there shouldn't be a space at the beginning or the end of the
 * sentence!
 * 
 * Example
 * Assumptions
 * 
 *  You can assume that you are only given words.
 *  You cannot assume the size of the array.
 *  You can assume that you do get an array.
 * 
 * What We're Testing
 * 
 * We're testing basic loops and string manipulation. This is for beginners who
 * are just learning loops and string manipulation.
 * 
 * Disclaimer
 * 
 * This is for beginners so we want to test basic loops and string manipulation.
 * Advanced users should easily be able to do this in one line.
 */
public class SmashWords {
    public static String smash(String words[]) {
        return Arrays.asList(words).stream().map(String::toString).collect(Collectors.joining(" "));
    }
}
