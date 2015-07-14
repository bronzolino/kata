package kata.solutions.unsolved;

/**
 * FIXME con 880 expected:<311.53> but was:<311.52>
 * 
 * Miles per gallon to kilometers per liter 8 KYU
 * 
 * Sometimes, I want to quickly be able to convert miles per gallon into
 * kilometers per liter.
 * 
 * Create an application that will display the number of kilometers per liter
 * (output) based on the number of miles per gallon (input).
 * 
 * Make sure to round off the result to two decimal points.
 * 
 * Some useful associations relevant to this kata:
 * 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
 */
public class Converter {
    public static float mpgToKPM(final float mpg) {
        
        return (float) ((Math.round((int)(mpg * 0.354 * 100.0))) / 100.0);
    }
}
