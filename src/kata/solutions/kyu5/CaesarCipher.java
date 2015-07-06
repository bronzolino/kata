package kata.solutions.kyu5;

import java.util.*;
/**
 * First Variation on Caesar Cipher 5KYU
 * 
 * The action of a Caesar cipher is to replace each plaintext letter with a 
 * different one a fixed number of places up or down the alphabet.
 * 
 * This program performs a variation of the Caesar shift. The shift increases by
 * 1 for each character (on each iteration).
 * 
 * If the shift is initially 1, the first character of the message to be encoded
 * will be shifted by 1, the second character will be shifted by 2, etc...
 * Coding: Parameters and return of function "movingShift"
 * 
 * param s: a string to be coded
 * 
 * param shift: an integer giving the initial shift
 * 
 * The function "movingShift" returns an array of strings containing the coded
 * string in 5 parts (five parts because, to avoid more risks, the coded message
 * will be given to five runners, one piece for each runner).
 * 
 * If possible the message will be evenly split between the five runners; if not
 * possible, parts 1, 2, 3, 4 will be longer and part 5 shorter. For example, if
 * the coded message has a length of 17 the five parts will have lengths 
 * of 4, 4, 4, 4, 1. The parts 1, 2, 3, 4 are evenly split and the last part of
 * length 1 is shorter. If the length is 16 the parts will be 4, 4, 4, 4, 0.
 * Parts 1, 2, 3, 4 are evenly split and the fifth runner will stay at home.
 * 
 * You will also implement a "demovingShift" function with two parameters
 * Decoding: parameters and return of function "demovingShift"
 * 
 * 1) an array of strings: s (possibly resulting from "movingShift", with 5 strings)
 * 
 * 2) an int shift
 * 
 * "demovingShift" returns a string.
 * Example:
 * 
 * u = "I should have known that you would have a perfect answer for me!!!"
 * 
 * movingShift(u, 1) returns :
 * 
 * v = ["J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!"]
 *     ["J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!"]
 * (quotes added in order to see the strings and the spaces, your program won't
 * write these quotes, see Example Test Cases)
 * 
 * and demovingShift(v, 1) returns u.
 */
public class CaesarCipher {
    
    private static final Map<Integer, Map<Character, Integer>> alphabet = new HashMap<>();
    private static final Map<Character, Integer> upperCases = new HashMap<>();
    private static final Map<Character, Integer> lowerCases = new HashMap<>();
    private static byte passo;
    
    static {
        int cnt = 1;
        for (int i = 65; i < 91; i++) upperCases.put((char) i, cnt++);
        cnt = 1;
        for (int i = 97; i < 123; i++) lowerCases.put((char) i, cnt++);
        //System.out.println("UpperCases.size() " + upperCases.size());
        //System.out.println("LowerCases.size() " + lowerCases.size());
        alphabet.put(0, upperCases);
        alphabet.put(1, lowerCases);
    }
    
    public static List<String>  movingShift(String s, int shift) {
        passo = 0;
        byte parts = 5;
        int len = s.length();
        int fourPartsLen = len / parts + 1;
        int fifthPartLen = (byte)(len - (fourPartsLen * 4));
        List<String> returnList = new ArrayList<>();
        for (byte i = 0; i < parts - 1; i++) {
            int endPoint = (i + 1) * fourPartsLen;
            String item = getItem(i, fourPartsLen, s.substring((i * fourPartsLen), endPoint).toCharArray());
            returnList.add(item);
        }
        int endPoint = (parts -1) * fourPartsLen + fifthPartLen;
        String item = getItem(parts, fifthPartLen, s.substring((parts - 1) * fourPartsLen, endPoint).toCharArray());
        returnList.add(item);
        return returnList;
    }

    public static String  demovingShift(List<String> s, int shift) {
        String plainText = "";
        passo = 0;
        String codedString = "";
        Iterator<String> it = s.iterator();
        while (it.hasNext()) codedString += it.next();
        int len = codedString.length();
        char chars[] = codedString.toCharArray();
        int oldPosition = 0;
        for (int i = 0; i < len; i++) {
            boolean found = false;
            passo++;
            for (int j = 0; j < 2; j++) {
                if (found) break;
                Map<Character, Integer> theMap = alphabet.get(j);
                if ((chars[i] + "").matches("\\p{Punct}") || (chars[i] == ' ')) {
                    plainText += chars[i];
                    found = true;
                }
                else if (theMap.containsKey(chars[i])) {
                    oldPosition = theMap.get(chars[i]);
                    found = true;
                    int newPosition = oldPosition - passo;
                    while (newPosition < 1) newPosition += theMap.size();
                    Iterator<Character> itc = theMap.keySet().iterator();
                    while (itc.hasNext()) {
                        char letter = itc.next();
                        if (theMap.get(letter) == newPosition) {
                            plainText += letter;
                            found = true;
                            break;
                        }
                    }
                }
            }
        }
        return plainText;
    }
    
    private static String getItem(int part, int len, char chars[]) {
        String item = "";
        for (byte j = 0; j < len; j++) {
            passo++;
            byte thisChar = (byte) chars[j];
            int nextChar =  thisChar + passo;
            boolean found = false;
            //System.out.println("Found " + found);
            for (int i = 0; i < 2; i++) {
                if (found) continue; //System.out.println("Found!");
                Map<Character, Integer> theMap = alphabet.get(i);
                if ((chars[j] + "").matches("\\p{Punct}") || (chars[j] == ' ')) {
                    item += chars[j];
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
        return item;
    }
}