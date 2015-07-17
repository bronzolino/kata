package kata.solutions.unsolved;

/**
 *
 * shorter concat [reverse longer] 7 KYU
 * 
 * Given 2 strings, a and b, return a string of the form:
 * shorter+reverse(longer)+shorter.
 * 
 * In other words, the shortest string has to be put as prefix and as suffix of
 * the reverse of the longest.
 * 
 * Strings a and b may be empty, but not null (In C# strings may also be null.
 * Treat them as if they are empty.).
 * If a and b have the same length treat a as the longer producing 
 * b+reverse(a)+b
 * 
 */
public class ReverseLonger {
    public static String shorterReverseLonger(String longer, String shorter) {
        System.out.println("\"" + longer + "\", \"" + shorter + "\"");
        if (longer.length() < shorter.length()) {
            String tmp = longer;
            longer = shorter;
            shorter = tmp;
        }
        String returnString = shorter;
        char chars[] = longer.toCharArray();
        int len = chars.length - 1;
        for (int i = len; i >= 0; i--) {
            returnString += chars[i];
        }
        return returnString + shorter;
    }
}
