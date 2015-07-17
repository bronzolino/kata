package kata.solutions.kyu7;

/**
 *
 * Partial Word Searching 7 KYU
 * 
 * Write a method that will search an array of strings for all strings that
 * contain another string, ignoring capitalization. Then return an array of the
 * found strings.
 * 
 * The method takes two parameters, the query string and the array of strings to
 * search, and returns an array.
 * 
 * If the string isn't contained in any of the strings in the array, the method
 * returns an array containing a single string: "Empty" (or Nothing in Haskell,
 * or "None" in Python)
 * Examples
 * 
 * If the string to search for is "me", and the array to search is ["home",
 * "milk", "Mercury", "fish"], the method should return ["home", "Mercury"].
 */

public class WordSearch {
    public static String[] findWord(String x, String[] y){
        String returnArray[] = new String[0];
        for (String s : y) {
            if (s.toLowerCase().contains(x.toLowerCase())) returnArray = addStringToArray(returnArray, s);
        }
        if (returnArray.length == 0) returnArray = addStringToArray(returnArray, "Empty");
        return returnArray;
    }
    
    private static String[] addStringToArray(String oldArray[], String theString) {
        int len = oldArray.length;
        String newArray[] = new String[len + 1];
        for (int i = 0; i < len; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[len] = theString;
        return newArray;
    }
}
