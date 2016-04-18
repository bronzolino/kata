package kata.solutions.java.kyu8;

/**
 *
 * Color Ghost 8 KYU
 * 
 * Create a class Ghost
 * 
 * Ghost objects are instantiated without any arguments.
 * 
 * Ghost objects are given a random color attribute of white" or "yellow" or 
 * "purple" or "red" when instantiated
 * 
 * Ghost ghost = new Ghost();
 * ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */

public class Ghost {
    
    public String getColor() {
        String colors[] = {"white","yellow","purple","red"};
        return colors[(int)(Math.random() * 4)];
    }
}
