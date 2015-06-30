package kata.solutions.unsolved;

/**
 * 
 * FIXME on example "Bana"
 * 
 * Merged String Checker 5KYU
 * 
 * Description:
 * 
 * At a job interview, you are challenged to write an algorithm to check if a
 * given string, s, can be formed from two other strings, part1 and part2.
 * 
 * The restriction is that the characters in part1 and part2 are in the same
 * order as in s.
 * 
 * The interviewer gives you the following example and tells you to figure out
 * the rest from the given test cases:
 * 
 * 'codewars' is a merge from 'cdw' and 'oears':
 * 
 *     s:  c o d e w a r s   = codewars
 * part1:  c   d   w         = cdw
 * part2:    o   e   a r s   = oears
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        s = s.replaceAll(" ", "");
        part1 = part1.replaceAll(" ", "");
        part2 = part2.replaceAll(" ", "");
        boolean merge = true;
        int p1Point = 0;
        int p2Point = 0;
        char chars[] = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (p2Point < part2.length() && chars[i] == part2.charAt(p2Point)) {
                System.out.println("[ " + i + " ] point2 : " + p2Point + " " + chars[i] + " == " + part2.charAt(p2Point));
                p2Point++;
            }
            else if (p1Point < part1.length() && chars[i] == part1.charAt(p1Point)) {
                System.out.println("[ " + i + " ] point1 : " + p1Point + " " + chars[i] + " == " + part1.charAt(p1Point));
                p1Point++;
            }
            else {
                System.out.println("FALSE");
                merge = false;
            }
        }
        return merge;
    }

}