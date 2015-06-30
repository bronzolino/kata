package kata.solutions;

import java.util.HashMap;
import java.util.Map;


public class StockList { 
	
    // 1st parameter is the stocklist (L in example), 
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int len = lstOf1stLetter.length;
        for (int i = 0; i < len; i++) {
            char letter = lstOf1stLetter[i].charAt(0);
            int score = 0;
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].charAt(0) == letter) {
                    score += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                }
            }
            map.put(letter, score);
        }
        StringBuilder sbi = new StringBuilder();
        boolean first = true;
        for (Character key : map.keySet()) {
            if (!first) sbi.append(" - ");
            first = false;
            sbi.append("(").append(key).append(" : ").append(map.get(key)).append(")");
        }
        return sbi.toString();
    }
}