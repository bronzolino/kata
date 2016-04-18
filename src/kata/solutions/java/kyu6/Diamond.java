package kata.solutions.java.kyu6;

/**
 * Give me Diamond 6 KYU
 * 
 * This kata is to practice simple string output. Jamie is a programmer, and
 * girlfriend of James. She likes diamonds, and this time she expects String of
 * diamond from James. As James doesn't know how to do it, he needs your help.
 * 
 * Task:
 * 
 * You need to print a shape on the screen using asterisk ("*") characters.
 * 
 * The shape that will be returned from print method resembles a diamond, where
 * the number provided as input represents the number of *’s printed on the 
 * middle line. The line above and below will be centered and will have 2 less
 *’s than the middle line. This reduction by 2 *’s for each line continues until
 * a line with a single * is printed at the top and bottom of the figure.
 * 
 * Return null if input is even number (as it is not possible to print diamond
 * with even number).
 * 
 * Please see provided test case(s) for examples.
 */
public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n <= 0)return null;
        else {
            String diamond = "";
            int middle = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) continue;
                middle = (n - i) / 2;
                for (int j = 0; j < n; j++) {
                    if (j >= middle && j<= middle + (i - 1)) diamond += "*";
                    else if (j < middle) diamond += " ";
                }
                diamond += "\n";
            }
            for (int i = n - 1; i >= 1; i--) {
                if (i % 2 == 0) continue;
                middle = (n - i) / 2;
                for (int j = 0; j < n; j++) {
                    if (j >= middle && j<= middle + (i - 1)) diamond += "*";
                    else if (j < middle) diamond += " ";
                }
                diamond += "\n";
            }
            return diamond;
        }
    }
}