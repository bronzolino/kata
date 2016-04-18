package kata.solutions.java.kyu8;

/**
 * 
 * Are You Playing Banjo? 8 KYU
 * 
 * Create a function which answers the question "Are you playing Banjo?". If
 * your name starts with the letter "R" or lower case "r", you are playing Banjo!
 * 
 * The function takes a name as its only argument, and returns one of the
 * following strings:
 * 
 * "[name] plays banjo"
 * "[name] does not play banjo"
 * 
 * Names given are always valid strings.
 */
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if ((name.charAt(0) + "").equalsIgnoreCase("R")) return name + " plays banjo";
        else return name + " does not play banjo";
    }
}