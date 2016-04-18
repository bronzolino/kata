package kata.solutions.java.kyu7;

/**
 *
 *  Alternate Square Sum 7KYU
 * 
 *  Write a method alternate_sq_sum (JS: alternateSqSum ) that takes an array of
 * Integers as Input and finds the sum of squares of the elements at even
 * positions (i.e 2nd 4th 6th etc etc elements) and the rest of the elements at
 * odd Position (i.e 1st 3rd etc elements) without squaring them (the odd ones)
 * thus completing whole array.
 * NOTE:
 * 
 * Elements at EVEN POSITION need to be squared, like element at index (assuming
 * starting index of an array in language to be 0 ) 1,3,5,7.. etc because 1st
 * elements will be at 1st position (though it would have 0 as its index).
 * For Example:
 * 
 * alternateSqSum(new int[] {11, 12, 13, 14, 15}) // should return 379
 * 
 * Explanation:
 * 
 * elements at indices 0, 2, 4 are 11, 13, 15 and they are at odd positions as
 * 11 is at position #1, 13 is at position #3 and 15 at #5.
 * 
 * elements at indices 1, 3 are 12 and 14 and they are at even position. So we
 * need to add 11, 13, 15 as they are and square of 12 and 14
 * 
 * --> 11 + 13 + 15 + 12^2 + 14^2
 * = 11 + 13 + 15 + 144 + 196
 * = 379
 * 
 * For empty arrays, result should be 0 (zero) (Except for Haskell)
 */
public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {
        int len = arr.length;
        if (len == 0) return 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0) sum += arr[i];
            else sum += (arr[i] * arr[i]);
        }
        return sum;
    }
}
