package kata.solutions.java.unsolved;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * Directions Reduction 6 KYU
 * 
 * Once upon a time, on a way through the old wild west,…
 * 
 * … a man was given directions to go from one point to another. The directions
 * were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are
 * opposite, "WEST" and "EAST" too. Going to one direction and coming back the
 * opposite direction is a needless effort. Since this is the wild west, with
 * dreadfull weather and not much water, it's important to save yourself some
 * energy, otherwise you might die of thirst!
 * 
 * How I crossed the desert the smart way.
 * 
 * The directions given to the man are, for example, the following:
 * 
 * String[] plan = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
 * 
 * You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable,
 * better stay to the same place! So the task is to give to the man a simplified
 * version of the plan. A better plan in this case is simply:
 * 
 * String[] plan = { "WEST" };
 * 
 * Other examples: In ["NORTH", "SOUTH", "EAST", "WEST"], the direction 
 * "NORTH" + "SOUTH" is going north and coming back right away. What a waste of
 * time! Better to do nothing. The path becomes ["EAST", "WEST"], now "EAST" and
 * "WEST" annihilate each other, therefore, the final result is []
 * (nil in Clojure). In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"],
 * "NORTH" and "SOUTH" are not directly opposite but they become directly
 * opposite after the reduction of "EAST" and "WEST" so the whole path is
 * reducible to ["WEST", "WEST"].
 * 
 * Task
 * 
 * You have to write a function dirReduc which will take an array of strings and
 * returns an array of strings with the needless directions removed
 * (W<->E or S<->N side by side).
 * 
 * The Haskell version takes a list of directions with data 
 * Direction = North | East | West | South. The Clojure version returns nil when
 * the path is reduced to nothing.
 * 
 * Examples
 * 
 * dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}) => new String[]{"WEST"}
 * dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}) => new String[]{}
 * 
 * Note
 * 
 * All paths can't be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"]
 * is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST"
 * are not directly opposite of each other and can't become such. Hence the
 * result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
 */

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