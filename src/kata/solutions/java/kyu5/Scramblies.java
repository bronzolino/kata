package kata.solutions.java.kyu5;

import java.util.HashSet;
import java.util.Set;

/**
 * Scramblies 5KYU
 * Write function scramble(str1,str2) that returns true if a portion of str1 
 * characters can be rearranged to match str2, otherwise returns false.
 * 
 * For example:
 * str1 is 'rkqodlw' and str2 is 'world' the output should return true.
 * str1 is 'cedewaraaossoqqyt' and str2 is 'codewars' should return true.
 * str1 is 'katas' and str2 is 'steak' should return false.
 * 
 * Only lower case letters will be used (a-z). No punctuation or digits will 
 * be included.
 * 
 * Performance needs to be considered
 */
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        boolean esito = true;
        Set giaFatti = new HashSet();
        char characters[] = str2.toCharArray();
        int cnt = 0;
        for (char c : characters) {
            if (giaFatti.contains(c)) {
                continue;
            }
            long cntCh1 = str1.chars().filter(ch -> ch == c).count();
            long cntCh2 = str2.chars().filter(ch -> ch == c).count();
            giaFatti.add(c);
            if (cntCh1 < cntCh2) {
                esito = false;
                break;
            }
        }
        return esito;
    }
}
