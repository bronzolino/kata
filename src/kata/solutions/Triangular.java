/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.solutions;

/**
 *  Triangolo di stelline
 * @author gabriele
 */
public class Triangular {
    public static int triangular(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) result += i;
        return result;
    }
}
