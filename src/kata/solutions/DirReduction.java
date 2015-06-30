package kata.solutions;

import java.util.Arrays;
import java.util.Iterator;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        Iterator<String> it = Arrays.asList(arr).iterator();
        int cnt = 0;
        int len = arr.length;
        while (it.hasNext()) {
            String currentDirection = it.next();
            for (int i = 0; i < len; i++) {
                if ((currentDirection.equalsIgnoreCase("NORTH") && arr[i].equalsIgnoreCase("SOUTH")) || 
                        (currentDirection.equalsIgnoreCase("SOUTH") && arr[i].equalsIgnoreCase("NORTH")) ||
                        (currentDirection.equalsIgnoreCase("WEST") && arr[i].equalsIgnoreCase("EAST")) ||
                        (currentDirection.equalsIgnoreCase("EAST") && arr[i].equalsIgnoreCase("WEST"))) {
                    arr = removeFromArray(arr, currentDirection, arr[i]);
                    len = arr.length;
                    break;
                }
            }
            cnt++;
        }
        return arr;
    }
    
    public static String[] removeFromArray(String array[], String d1, String d2) {
        int oldLen = array.length;
        int newLen = array.length - 2;
        String newArray[] = new String[newLen];
        int pos = 0;
        boolean d1Found = false;
        boolean d2Found = false;
        for (int i = 0; i < oldLen; i++) {
            if (!d1Found && array[i].equals(d1)) {
                d1Found = true;
                continue;
            }
            else if (!d2Found && array[i].equals(d2)) {
                d2Found = true;
                continue;
            }
            newArray[pos] = array[i];
            pos++;
        }
        return newArray;
    }
}