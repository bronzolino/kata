package kata.solutions.java.kyu7;

/**
 * SequenceSum 7 KYU
 * 
 * Sum of 'n' Numbers
 * 
 * sum_of_n (or SequenceSum.sumOfN in Java, SequenceSum.SumOfN in C#) takes an
 * integer n and returns a List (an Array in Java/C#) of length abs(n) + 1. The
 * List/Array contains the numbers in the arithmetic series produced by taking
 * the sum of the consecutive integer numbers from 0 to n inclusive.
 * 
 *  n can also be 0 or a negative value.
 * 
 * Example:
 * 
 * 5 -> [0, 1, 3, 6, 10, 15]
 * 
 * -5 -> [0, -1, -3, -6, -10, -15]
 * 
 * 7 -> [0, 1, 3, 6, 10, 15, 21, 28]
 */
public class SequenceSum {
    public static int[] sumOfN(int n) {
        int returnArray[] = new int[Math.abs(n) + 1];
        int partial = 0;
        if (n >0)
            for (int i = 0; i <= n; i++) {
                partial += i;
                returnArray[i] = partial;
            }
        else 
            for (int i = 0; i >= n; i--) {
                partial += i;
                returnArray[Math.abs(i)] = partial;
            }
        return returnArray;
    }
}
