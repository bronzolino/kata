package kata.solutions.kyu7;

import java.util.Arrays;

/**
 * Descending Order
 * 
 * Your task is to make a function that can take any non-negative integer as a
 * argument and return it with it's digits in descending order. Descending order
 * means that you take the highest digit and place the next highest digit
 * immediately after it.
 * 
 * Examples:
 * 
 * Input: 145263 Output: 654321
 * 
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {
  public static int sortDesc(final int num) {
    char chars[] = (num + "").toCharArray();
        Arrays.sort(chars);
        String result = "";
        for (int i = (chars.length -1); i >= 0; i--) result += "" + chars[i];
        return Integer.parseInt(result);
  }
}