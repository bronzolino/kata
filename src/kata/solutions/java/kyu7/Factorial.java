package kata.solutions.java.kyu7;

/**
 * Factorial 7 KYU
 * 
 * In mathematics, the factorial of a non-negative integer n, denoted by n!, is
 * the product of all positive integers less than or equal to n.
 * For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1
 * 
 * Write a function to calculate factorial for a given input. If input is below
 * 0 or above 12 throw an exception of type ArgumentOutOfRangeException (C#) or
 * IllegalArgumentException (Java).
 * 
 * More details about factorial can be found here: 
 * http://en.wikipedia.org/wiki/Factorial
 */

public class Factorial {
    public int factorial(int n) {
        if (n == 0) return 1;
        else if (n < 0 || n > 12) throw new IllegalArgumentException();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
