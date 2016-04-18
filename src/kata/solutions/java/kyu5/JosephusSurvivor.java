package kata.solutions.java.kyu5;

/**
 * 5 KYU 
 * 
 * Josephus Survivor
 * 
 * In this kata you have to correctly return who is the "survivor", ie: the last
 * element of a Josephus permutation.
 * 
 * Basically you have to assume that n people are put into a circle and that
 * they are eliminated in steps of k elements, like this:
 * 
 * josephus_survivor(7,3) => means 7 people in a circle;
 * one every 3 is eliminated until one remains
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out
 * [1,2,4,5,7] => 6 is counted out
 * [1,4,5,7] => 2 is counted out
 * [1,4,5] => 7 is counted out
 * [1,4] => 5 is counted out
 * [4] => 1 counted out, 4 is the last element - the survivor!
 * 
 * The above link about the "base" kata description will give you a more
 * thorough insight about the origin of this kind of permutation, but basically
 * that's all that there is to know to solve this kata.
 * 
 * Notes and tips: using the solution to the other kata to check your function
 * may be helpful, but as much larger numbers will be used, using an array/list
 * to compute the number of the survivor may be too slow; you may assume that
 * both n and k will always be >=1.
 */
public class JosephusSurvivor {
    /**
     *  
     * @param n = 7
     * @param k = 3
     * @return the survivor
     */
    public static int josephusSurvivor(final int n, final int k) {
        int returnValue = 0;
        Integer array[] = new Integer[n];
        int len = array.length;
        int point = -1;
        for (int i = 0; i < len; i++) array[i] = i + 1;
        for (int i = 0; i < len -1; i++) {
            for (int j = 0; j < k; j++) {
                point++;
                if (point > len - 1) point = 0;
                if (array[point] == 0) j--;
            }
            array[point] = 0;
        }
        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                returnValue = array[i];
            }
        }
        return returnValue;
    }
}