/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.solutions.java.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Batman Quotes 7 KYU
 * 
 * Batman & Robin have gotten into quite a pickle this time. The Joker has mixed
 * up their iconic quotes and also replaced one of the characters in their
 * names, with a number. They need help getting things back in order.
 * 
 * Implement the getQuote method which takes in an array of quotes, and a string
 * comprised of letters and a single number (e.g. "Rob1n") where the number
 * corresponds to their quote indexed in the passed in array.
 * 
 * Return the quote along with the character who said it:
 * 
 * BatmanQuotes.getQuote(["I am vengeance. I am the night. I am Batman!", "Holy haberdashery, Batman!", "Let's put a smile on that faaaceee!"], "Rob1n") should output =>  "Robin: Holy haberdashery, Batman!
 * 
 * Hint: You are guaranteed that the number in the passed in string is placed
 * somewhere after the first 3 characters of the string. The quotes either
 * belong to Batman, Robin, or Joker.
 */
public class BatmanQuotes {
    public static String getQuote(String[] quotes, String hero){
        String returnString = "";
        String heroes[] = {"Batman", "Robin", "Joker"};
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(hero);
        if (matcher.find())
        {
            returnString = heroes[Integer.parseInt(matcher.group(0))] + ": " + quotes[Integer.parseInt(matcher.group(0))];
        }
        return returnString;
    }
}
