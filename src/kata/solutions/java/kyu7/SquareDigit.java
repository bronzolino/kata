/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.solutions.java.kyu7;

/**
 * 
 * Square Every Digit KYU 7
 * 
 * Welcome. In this kata, you are asked to square every digit of a number.
 * 
 * For example, if we run 9119 through the function, 811181 will come out.
 * 
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {
    public int squareDigits(int n) {
        char chars[] = (n + "").toCharArray();
        int len = chars.length;
        String tot = "";
        for (int i = 0; i < len; i++) {
            tot += (int)Math.pow(Integer.parseInt((chars[i] + "")),2);
        }
        return Integer.parseInt(tot);
    }
    
}
