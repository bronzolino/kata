package kata.solutions.java.kyu8;

/**
 * Counting sheep... 8 KYU
 * 
 * Consider an array of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array
 * (true means present).
 */
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean isPresent : arrayOfSheeps) if (isPresent) counter++;
        return counter;
    }
}