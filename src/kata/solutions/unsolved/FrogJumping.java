/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.solutions.unsolved;

/**
 *
 * Frog jumping 6 KYU
 * 
 * Help the frog to find a way to freedom
 * 
 * You have an array of integers and have a frog at the first position
 * 
 * [Frog, int, int, int, ..., int]
 * 
 * The integer itself may tell you the length and the direction of the jump
 * 
 * For instance:
 * 2 = jump two indices to the right
 * -3 = jump three indices to the left
 * 0 = stay at the same position
 * 
 * Your objective is to find how many jumps are needed to jump out of the array.
 * 
 * Return -1 if Frog can't jump out of the array
 * 
 * Example:
 * array = [1, 2, 1, 5]; 
 * jumps = 3  (1 -> 2 -> 5 -> <jump out>)
 * 
 * All tests for this Kata are randomly generated
 */
public class FrogJumping {
    public static int solution(int[] a) {
        System.out.println("Ho un array di " + a.length);
        System.out.println(a);
        int jumps = 0;
        int position = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            position += a[i];
            jumps++;
            System.out.println("[ " + i + " ] Sono alla posizione " + position + " dopo " + jumps + " salto");
            if (position > len) {
                return jumps;
            }
        }
        return -1;
    }
}
