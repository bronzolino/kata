package kata.solutions.kyu8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Basic subclasses - Adam and Eve 8 KYU
 * 
 * According to the creation myths of the Abrahamic religions, Adam and Eva were
 * the first Humans to wander the earth.
 * 
 * You have to do God’s job. The creation method must return an array of length
 * 2 containing objects representing Adam and Eva. The first object in the array
 * should be an instance of the class Man. The second should be an instance of
 * the class Woman. Both objects have to be subclasses of Human. Your job is to
 * implement the Human, Man and Woman classes.
 */
public class God {
    private static Human humans[] = new Human[2];
    private static Man man;
    private static Woman woman;
    static {
        try {
            man = Man.class.newInstance();
            woman = Woman.class.newInstance();
        }
        catch (Exception ex) {
            
        }
    }
    public static Human[] create(){
        humans[0] = man;
        humans[1] = woman;
        return humans;
    }
}

class Human {
    
}

class Man extends Human {

}

class Woman extends Human {

}
