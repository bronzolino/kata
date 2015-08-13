package kata.solutions.kyu7;

/**
 * Building blocks 7 KYU
 * 
 * Write a class Block that creates a block (Duh..)
 * Requirements
 * 
 * The constructor should take an array as an argument, this will contain 3
 * integers of the form [width, length, height] from which the Block should be
 * created.
 * 
 * Define these methods:
 * 
 * `getWidth()` return the width of the `Block`
 * 
 * `getLength()` return the length of the `Block`
 * 
 * `getHeight()` return the height of the `Block`
 * 
 * `getVolume()` return the volume of the `Block`
 * 
 * `getSurfaceArea()` return the surface area of the `Block`
 * 
 * Examples
 * 
 *  Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a 
 *                          width of `2` a length of `4` and a height of `6`
 *  b.getWidth() // -> 2
 * 
 *  b.getLength() // -> 4
 * 
 *  b.getHeight() // -> 6
 * 
 *  b.getVolume() // -> 48
 *  
 *  b.getSurfaceArea() // -> 88
 * 
 * Note: no error checking is needed
 * 
 * Any feedback would be much appreciated

 */
public class Block {
    
    private int width;
    private int length;
    private int height;
    
    public Block(int measures[]) {
        this.width = measures[0];
        this.length = measures[1];
        this.height = measures[2];
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getVolume() {
        return this.height * this.length * this.width;
    }
    
    public int getSurfaceArea() {
        return 2 * this.height * this.length + 2 * this.length * this.width + 2 * this.height * this.width;
    }
}
