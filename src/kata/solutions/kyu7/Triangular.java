package kata.solutions.kyu7;

/**
 * Triangular Treasure
 * 
 * Triangular numbers are so called because of the equilateral triangular shape
 * that they occupy when laid out as dots. i.e.
 * 
 * 1st (1)   2nd (3)    3rd (6)
 *   *          **        ***
 *              **        **
 *                        *
 * 
 * You need to return the nth triangular number. You should return 0 for out of range values:
 */
public class Triangular {
    public static int triangular(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) result += i;
        return result;
    }
}
