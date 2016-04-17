package kata.solutions.kyu6;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Correct but Submission timed out.
 * Single Word Pig Latin 6 KYU
 * 
 * Pig Latin is an English language game where the goal is to hide the meaning 
 * of the word from people not aware of the rules.
 * 
 * The rules themselves are rather easy:
 * 
 * 1) The word starts with a vowel -> return the original string plus way
 * 
 * 2) The word starts with a consonant -> move consonants from the beginning of
 * the word to the end of the word until the first vowel, then return it plus ay
 * 
 * 3) The result must be lowercase, regardless of the case of the input. If
 * input string has any non-alpha characters, the function must return None,
 * null (depending by language).
 * 
 * 4) The function must also handle simple random strings and not just english
 * words
 * 
 * 5) The input string has no vowels -> return the original string plus ay
 * 
 * For example the word "spaghetti" become"aghettispay" because the first two
 * letter ("sp") are consonants, so they are moved to the end of the
 * string + "ay"
 */
public class PigLatin {
 
    public String translate(String str) {
        str = str.toLowerCase();
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        /**
         * 1) The word starts with a vowel -> return the original string plus way
         */
        if (vowels.contains(str.charAt(0))) {
            return (str + "way").toLowerCase();
        }
        
        /**
         * 3) If input string has any non-alpha characters, the function must 
         * return None,
         */
        boolean hasNumbers = str.chars().filter(ch -> Character.isDigit(ch)).count() > 0;
        if (hasNumbers) {
            return null;
        }
        
        /**
         * 2) The word starts with a consonant -> move consonants from the beginning of
         * the word to the end of the word until the first vowel, then return it plus ay
         */
        char chars[] = str.toCharArray();
        int len = chars.length;
        String temp = "";
        boolean isAlpha = true;
        for (int i = 0; i < len; i++) {
            char currentChar = chars[i];
            if (!Character.isLetter(currentChar)) isAlpha = false;
            if (vowels.contains(currentChar)) {
                return (currentChar + str.substring(i + 1,len) + temp + "ay").toLowerCase();
            }
            temp += chars[i];
        }
        /**
         * 5) The input string has no vowels -> return the original string plus ay
         */
        if (isAlpha) {
            return (str.substring(0,len) + "ay").toLowerCase();
        }
        else return null;
    }
}