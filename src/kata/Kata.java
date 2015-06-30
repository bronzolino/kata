/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.security.acl.Group;
import java.util.Arrays;
import java.util.Iterator;
import kata.solutions.BuyCar;
import kata.solutions.Chocolate;
import kata.solutions.CircleSorted;
import kata.solutions.DirReduction;
import kata.solutions.Dubstep;
import kata.solutions.GiftSorter;
import kata.solutions.Groups;
import kata.solutions.SpinWords;
import kata.solutions.StockList;
import kata.solutions.Triangular;

/**
 *
 * @author gabriele
 */
public class Kata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println(Chocolate.breakChocolate(7, 7));
        int[] numbers ={9,10,14,12};
        CircleSorted cs = new CircleSorted();
        System.out.println(cs.isCircleSorted(numbers));
        
        System.out.println(new SpinWords().spinWords("Hey fellow warriors"));
        System.out.println("len " + Arrays.asList(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})).size());
        Iterator<String> it = Arrays.asList(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})).iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
        String articles[] = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String letters[] = {"A", "B", "C", "W"};
        System.out.println(StockList.stockSummary(articles, letters));
        System.out.println(Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
    }
    
}
