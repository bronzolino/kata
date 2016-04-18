package kata.solutions.java.unsolved;

import java.math.BigInteger;

/**
 *
 * @author gabriele
 */
public class Powers {
    public static BigInteger powers(int[] list) {
        return new BigInteger(((int)Math.pow(2, list.length)) + "");
    }
}
