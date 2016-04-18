package kata.solutions.java.kyu7;

import java.util.Arrays;

/**
 *
 * Vowel Count 7 KYU
 * 
 * Return the number (count) of vowels in the given string.
 * 
 * We will consider a, e, i, o, and u as vowels for this Kata.
 */

public class Vowels {
    public static int getCount(String str) {
        Character vowels[] = {'a','e','i','o','u'};
        int vowelsCount = 0;
        char chars[] = str.toCharArray();
        for (Character c : chars) {
            if (Arrays.asList(vowels).contains(c)) vowelsCount++;
        }
        return vowelsCount;
    }
}
