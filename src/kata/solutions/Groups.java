package kata.solutions;

/**
 *
 *  Controlla l'esatto posizionamento delle parentesi
 * 
 *  () TRUE
 *  [) FALSE
 * @author gabriele
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