package kata.solutions.kyu5;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)
 * 
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * 
 * The maximum time never exceeds 359999 (99:59:59)
 * 
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int secondsPerHour = 60 * 60;
        int hours = seconds / secondsPerHour;
        int remainingTime = seconds % secondsPerHour;
        int minuts = remainingTime / 60;
        seconds = remainingTime % 60;
        String returnValue = "";
        if (hours < 10) returnValue += "0";
        returnValue += hours + ":";
        if (minuts < 10) returnValue += "0";
        returnValue += minuts + ":";
        if (seconds < 10) returnValue += "0";
        returnValue += seconds;
        return returnValue;
    }
}