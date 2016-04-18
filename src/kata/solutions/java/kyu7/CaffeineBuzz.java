package kata.solutions.java.kyu7;

/**
 *
 * Caffeine Script 7 KYU
 * 
 * Complete the function caffeineBuzz, which takes a non-zero integer as it's
 * one argument.
 * 
 * If the integer is divisible by 3, return the string "Java".
 * 
 * If the integer is divisible by 3 and divisible by 4, return the string
 * "Coffee"
 * 
 * If the integer is one of the above and is even, add "Script" to the end of
 * the string.
 * 
 * Otherwise, return the string "mocha_missing!"
 * 
 * caffeineBuzz(1)   => "mocha_missing!"
 * caffeineBuzz(3)   => "Java"
 * caffeineBuzz(6)   => "JavaScript"
 * caffeineBuzz(12)  => "CoffeeScript"
 */
public class CaffeineBuzz {
    public static String caffeineBuzz(int n){
        String returnString = "";
        if (n % 3 == 0) returnString = "Java";
        if (n % 3 == 0 && n % 4 == 0) returnString = "Coffee";
        if (!returnString.equals("") && n % 2 == 0) returnString += "Script";
        if (returnString.equals("")) returnString = "mocha_missing!";
        return returnString;
    }
}
