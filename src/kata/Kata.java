/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kata.solutions.kyu5.JosephusSurvivor;
import kata.solutions.unsolved.BuyCar;
import kata.solutions.kyu7.Chocolate;
import kata.solutions.kyu6.CircleSorted;
import kata.solutions.kyu7.Collatz;
import kata.solutions.unsolved.DirReduction;
import kata.solutions.kyu6.Dubstep;
import kata.solutions.kyu6.Game;
import kata.solutions.kyu7.GiftSorter;
import kata.solutions.unsolved.Groups;
import kata.solutions.kyu5.Max;
import kata.solutions.kyu6.SpinWords;
import kata.solutions.kyu6.StockList;
import kata.solutions.unsolved.StringMerger;
import kata.solutions.kyu7.Triangular;
import kata.solutions.kyu5.HumanReadableTime;
import kata.solutions.kyu5.CaesarCipher;
import kata.solutions.unsolved.Josephus;
import kata.solutions.unsolved.PigLatin;
import kata.solutions.unsolved.Rotator;
import kata.solutions.kyu6.Xbonacci;

/**
 *
 * @author gabriele
 */
public class Kata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
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
        /*String articles[] = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String letters[] = {"A", "B", "C", "W"};
        System.out.println(StockList.stockSummary(articles, letters));
        System.out.println(Dubstep.SongDecoder("RWUBWUBWUBLWUB"));*/
        
        //System.out.println(new Game().winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));
        //System.out.println(StringMerger.isMerge("codewars", "code", "wars"));
        //System.out.println(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
        //System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        //System.out.println(Collatz.conjecture(20));
        //System.out.println(JosephusSurvivor.josephusSurvivor(7, 3));
        //System.out.println(HumanReadableTime.makeReadable(86399));
        /*Object items[] = new Object[]{"C", "o", "d", "e", "W", "a", "r", "s"};
        System.out.println(Josephus.josephusPermutation(new ArrayList(Arrays.asList(items)),2));*/
        /*Rotator rotator = new Rotator();
        Object data[] = rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 2);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }*/
        /*int shift = 1;
        String plainText = "I should have known that you would have a perfect answer for me!!!";
        System.out.println(plainText);
        List<String>  moved = CaesarCipher.movingShift(plainText, shift);
        System.out.println(moved);
        String demoved = CaesarCipher.demovingShift(moved, shift);
        System.out.println(demoved);*/
        //System.out.println(PigLatin.class.newInstance().translate("xyze"));
        Xbonacci variabonacci = new Xbonacci();
        double serie[] = variabonacci.tribonacci(new double []{1,1,1},10);
        for (int i = 0; i < serie.length; i++) System.out.print((int)serie[i] + ",");
        
    }
    
}
