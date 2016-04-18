package kata.solutions.java.unsolved;

/**
 *
 * Lucas numbers 6 KYU
 * 
 * Lucas numbers are numbers in a sequence defined like this:
 * 
 * L(n) = 2 if n = 0
 * 
 * L(n) = 1 if n = 1
 * 
 * otherwise
 * 
 * L(n) = L(n - 1) + L(n - 2)
 * 
 * Your mission is to define a function lucasnum(n) that returns the nth term of
 * this sequence.
 * 
 * Note: It should work for negative numbers as well (how you do this is you
 * flip the equation around, so for negative numbers: L(n) = L(n + 2) - L(n + 1))
 * 
 * Examples:
 * 
 * lucasnum(-10) -> 123
 * lucasnum(-5) -> -11
 * lucasnum(-1) -> -1
 * lucasnum(0) -> 2
 * lucasnum(1) -> 1
 * lucasnum(5) -> 11
 * lucasnum(10) -> 123
 */
public class Lucas {
    public static int lucasnum (int n){
        System.out.println("n = " + n);
        boolean negative = n < 0;
        n = Math.abs(n);
        int lucas[] = new int[n + 1];
        lucas[0] = 2;
        lucas[1] = 1;
        for (int i = 2; i <= n; i++) {
            lucas[i] = lucas[i-1] + lucas[i-2];
            System.out.print(lucas[i] + ",");
        }
        System.out.println();
        if (negative) return lucas[n] * -1;
        else return lucas[n];
    }
}
