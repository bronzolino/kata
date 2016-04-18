package kata.solutions.java.kyu7;

/**
 *
 * Highest and Lowest 7 KYU
 * 
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * 
 * Example:
 * 
 * HighAndLow("1 2 3 4 5") // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notes:
 * 
 *  All numbers are valid Int32, no need to validate them.
 *  There will always be at least one number in the input string.
 *  Output string must be two numbers separated by a single space, and highest number is first.
 */

public class HighAndLowKata {
    public static String HighAndLow(String numbers) {
        String chars[] = numbers.split(" ");
        int lowest = Integer.parseInt(chars[0]);
        int highest = Integer.parseInt(chars[0]);
        for (String num : chars) {
            int intnum = Integer.parseInt(num);
            if (intnum > highest) highest = intnum;
            if (intnum < lowest) lowest = intnum;
        }
        return highest + " " + lowest;
    }
}
