package kata.solutions.kyu6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * Playing with passphrases 6 KYU
 * 
 * Everyone knows passphrases. One can choose passphrases from poems, songs,
 * movies names and so on but frequently they can be guessed due to common
 * cultural references. You can get your passphrases stronger by different
 * means. One is the following:
 * 
 * choose a text in capital letters including or not digits and non alphabetic
 * characters,
 * 
 * 1. shift each letter by a given number but the transformed letter must be a
 *      letter (circular shift),
 * 2. replace each digit by its complement to 9,
 * 3. keep such as non alphabetic and non digit characters,
 * 4. downcase each letter in odd position, upcase each letter in even position
 *      (the first character is in position 0),
 * 5. reverse the whole result.
 * 
 * Example:
 * 
 * your text: "BORN IN 2015!", shift 1
 * 
 * 1 + 2 + 3 -> "CPSO JO 7984!"
 * 
 * 4 "CpSo jO 7984!"
 * 
 * 5 "!4897 Oj oSpC"
 * 
 * With longer passphrases it's better to have a small and easy program. Would
 * you write it?
 * 
 * https://en.wikipedia.org/wiki/Passphrase
 */
public class PlayPass {
    
    private static final Map<Integer, Map<Character, Integer>> alphabet = new HashMap<>();
    private static final Map<Character, Integer> upperCases = new HashMap<>();
    private static final Map<Character, Integer> lowerCases = new HashMap<>();
    
    static {
        int cnt = 1;
        for (int i = 65; i < 91; i++) upperCases.put((char) i, cnt++);
        cnt = 1;
        for (int i = 97; i < 123; i++) lowerCases.put((char) i, cnt++);
        alphabet.put(0, upperCases);
        alphabet.put(1, lowerCases);
    }
    
    public static String playPass(String s, int passo) {
        char chars[] = s.toCharArray();
        int len = chars.length;
        String item = "";
        for (byte j = 0; j < len; j++) {
            byte thisChar = (byte) chars[j];
            int nextChar =  thisChar + passo;
            boolean found = false;
            //System.out.println("Found " + found);
            for (int i = 0; i < 2; i++) {
                if (found) continue; //System.out.println("Found!");
                Map<Character, Integer> theMap = alphabet.get(i);
                if ((chars[j] + "").matches("\\p{Punct}") || (chars[j] == ' ') || (chars[j] + "").matches("\\{(.*?)\\}")) {
                    item += chars[j];
                    found = true;
                }
                if ((chars[j] + "").matches("\\d")) {
                    item += Math.abs(Integer.parseInt(chars[j] + "") - 9);
                    found = true;
                }
                else if (theMap.containsKey((char) nextChar)) {
                    item += (char) nextChar;
                    found = true;
                }
                else {
                    Iterator<Character> it = theMap.keySet().iterator();
                    int oldPosition = 0;
                    while (it.hasNext()) {
                        char letter = it.next();
                        if (letter == (char) thisChar) {
                            oldPosition = theMap.get(letter);
                            //System.out.println("Trovo oldPosition " + oldPosition + " break---->");
                            break;
                        }
                    }
                    if (oldPosition == 0) continue;
                    int rotatePosition = (oldPosition - theMap.size() + passo);
                    //System.out.println("Sto cercando . " + (char) thisChar);
                    //System.out.println("(rotatePosition = " + rotatePosition + " = (oldPosition : " + oldPosition + ") - (theMap.size() : " + theMap.size() + ") + (passo : " + passo + ")");
                    //System.out.println(theMap);
                    while (rotatePosition > theMap.size()) rotatePosition -= theMap.size();
                    it = theMap.keySet().iterator();
                    while (it.hasNext()) {
                        char letter = it.next();
                        if (theMap.get(letter) == rotatePosition) {
                            item += letter;
                            found = true;
                            break;
                        }
                    }
                }
            }
        }
        chars = item.toCharArray();
        item = "";
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) item += (chars[i] + "").toUpperCase();
            else item += (chars[i] + "").toLowerCase();
        }
        chars = item.toCharArray();
        item = "";
        for (int i = len -1; i >= 0; i--) {
            item += chars[i];
        }
        return item;
    }
}
