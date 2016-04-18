package kata.solutions.java.kyu7;

/**
 * Complementary DNA 7 KYU
 * 
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
 * carries the "instructions" for the development and functioning of living
 * organisms.
 * 
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * 
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and
 * "G". You have function with one side of the DNA (string, except for Haskell);
 * you need to get the other complementary side. DNA strand is never empty or
 * there is no DNA at all (again, except for Haskell).
 * 
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
 * 
 * DnaStrand.makeComplement("GTAT") // return "CATA"
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        char chars[] = dna.toCharArray();
        int len = chars.length;
        StringBuilder sbui = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char charToAdd = chars[i];
            if (charToAdd == 'A') charToAdd = 'T';
            else if (charToAdd == 'T') charToAdd = 'A';
            else if (charToAdd == 'C') charToAdd = 'G';
            else if (charToAdd == 'G') charToAdd = 'C';
            sbui.append(charToAdd);
        }
        return sbui.toString();
    }
}
