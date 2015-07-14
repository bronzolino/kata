package kata.solutions.kyu8;

/**
 * Even or Odd 8 KYU
 * 
 * Create a function that takes an integer as an argument and returns
 * "Even" or "Odd".
 */

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
