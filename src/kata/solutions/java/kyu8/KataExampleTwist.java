package kata.solutions.java.kyu8;

/**
 * Kata Example Twist 8 KYU
 * 
 * This is an easy twist to the example kata (provided by Codewars when learning
 * how to create your own kata).
 * 
 * Add the value "codewars" to the websites array 1,000 times.
 * 
 * String[] websites = {};
 * return websites;
 */
public class KataExampleTwist {
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];
        for (int i = 0; i < 1000; i++) websites[i] = "codewars";
        return websites;
    }
}
