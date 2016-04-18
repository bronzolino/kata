package kata.solutions.java.unsolved;

/**
 *
 * Recursive reverse string 7 KYU
 * 
 * Write a recursive function that returns a string in reverse order.
 * 
 * A recursive function is a function that calls itself during its execution.
 * 
 * Example of recursive function that finding a factorial of n.
 * 
 * Your objective is to write a recursive function with a length equal to length
 * of input string. Length of function in this context means how many times this
 * function has been executed during the processing of a final result.
 * 
 * All tests of this Kata are randomly generated
 */
public class Reverse {
    private int total = 0;
    private boolean first = true;
    
    public String reverse(String str) {
        if (str.length() == 0) return null;
        else if (str.length() == 1) return str;
        else if (this.first) {
            this.first = false;
            this.reverse(str);
        }
        else {
            
            StringBuilder sbui = new StringBuilder();
            char chars[] = str.toCharArray();
            for (int i = 0; i < str.length() -1; i++) {
                if (i == total) sbui.append(chars[str.length() - 1]);
                sbui.append(chars[i]);
            }
            this.total++;
            if (this.total == str.length() - 1) {
                System.out.println("Reversed " + sbui.toString());
                return sbui.toString();
            }
            else {
                this.reverse(sbui.toString());
                return null;
            }
        }
        return null;
    }
}
