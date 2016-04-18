/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.solutions.java.kyu8;

/**
 *
 * Broken sequence 8 KYU (BETA)
 * 
 * You have a sequence of positive numbers starting with 1, but one number is
 * missing!
 * 
 * Find out the missing number; if the sequence is not broken, you should return
 * 0. Each sequence always increments by 1.
 * 
 * In short: an invalid sequence must return 1, an already complete (or empty)
 * sequence must return 0; otherwise return the missing element.
 * 
 * Note that the sequence may be shuffled.
 * 
 * E.g.
 * 
 * new BrokenSequence().findMissingNumber("1 2 3 5") // returns 4
 * 
 * new BrokenSequence().findMissingNumber("1 2 3 4") // returns 0
 * 
 * new BrokenSequence().findMissingNumber("5 1 3 4") // returns 2
 */

public class BrokenSequence {
    public int findMissingNumber(String sequence) {	
        int missing = 0;
        if (sequence.equals("")) return missing;
        boolean found = false;
        char chars[] = sequence.replaceAll(" ", "").toCharArray();
        int len = chars.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == '1') {
                found = true;
            }
            if (found && Integer.parseInt((chars[i] + "")) != ++cnt) {
                missing = cnt;
                break;
            }
        }
        if (!found) missing = 1;
        return missing;
    }
}