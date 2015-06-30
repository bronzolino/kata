package kata.solutions.unsolved;

/**
 * Checking Groups 6 KYU
 * 
 * Checking Groups
 * 
 * In English and programming, groups can be made using symbols such as "()"
 * and "{}" that change meaning. However, these groups must be closed in the
 * correct order to maintain correct syntax.
 * 
 * Your job in this kata will be to make a program that checks a string for
 * correct grouping. For instance, the following groups are done correctly:
 * 
 * ({})
 * [[]()]
 * [{()}]
 * 
 * The next are done incorrectly
 * 
 * {(})
 * ([]
 * [])
 * 
 * A correct string cannot close groups in the wrong order, open a group but
 * fail to close it, or close a group before it is opened.
 * 
 * Your function will take an input string that may contain any of the symbols
 * "()" "{}" or "[]" to create groups.
 * 
 * It should return True if the string is empty or otherwise grouped correctly,
 * or False if it is grouped incorrectly.
 */
public class Groups
{
    public static boolean groupCheck(String s){
        boolean isCorrect = true;
        //String regex = "\\w*?\\{\\w*?\\[\\w*?\\(\\w*?\\)\\w*?\\]\\w*?\\}";
        char characters[] = s.toCharArray();
        int len = characters.length;
        for (int i = 0; i < len; i++) {
            char candidate = characters[i];
            if (candidate != '{' && candidate != '[' && candidate != '(') continue;
            if (candidate == '(') {
                for (int j = i; j < len; j++) {
                    
                }
            }
        }
        return isCorrect;
    }
}