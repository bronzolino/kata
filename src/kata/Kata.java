/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.beans.PersistenceDelegate;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kata.solutions.java.kyu5.JosephusSurvivor;
import kata.solutions.java.unsolved.BuyCar;
import kata.solutions.java.kyu7.Chocolate;
import kata.solutions.java.kyu6.CircleSorted;
import kata.solutions.java.kyu7.Collatz;
import kata.solutions.java.unsolved.DirReduction;
import kata.solutions.java.kyu6.Dubstep;
import kata.solutions.java.kyu6.Game;
import kata.solutions.java.kyu7.GiftSorter;
import kata.solutions.java.unsolved.Groups;
import kata.solutions.java.kyu5.Max;
import kata.solutions.java.kyu6.SpinWords;
import kata.solutions.java.kyu6.StockList;
import kata.solutions.java.unsolved.StringMerger;
import kata.solutions.java.kyu7.Triangular;
import kata.solutions.java.kyu5.HumanReadableTime;
import kata.solutions.java.kyu5.CaesarCipher;
import kata.solutions.java.unsolved.Josephus;
import kata.solutions.java.kyu6.PigLatin;
import kata.solutions.java.unsolved.Rotator;
import kata.solutions.java.kyu6.Xbonacci;
import kata.solutions.java.kyu7.EANValidator;
import kata.solutions.java.kyu8.Ghost;
import kata.solutions.java.kyu6.TriangleNumbers;
import kata.solutions.java.unsolved.Converter;
import kata.solutions.java.kyu7.Factorial;
import kata.solutions.java.kyu8.God;
import kata.solutions.java.kyu8.KataExampleTwist;
import kata.solutions.java.kyu8.Bio;
import kata.solutions.java.kyu7.Circle;
import kata.solutions.java.kyu7.SequenceSum;
import kata.solutions.java.kyu7.SquareDigit;
import kata.solutions.java.kyu7.BatmanQuotes;
import kata.solutions.java.kyu7.WordSearch;
import kata.solutions.java.kyu7.Square;
import kata.solutions.java.kyu7.CompleteThePattern;
import kata.solutions.java.kyu7.BinaryCalculator;
import kata.solutions.java.kyu6.PlayPass;
import kata.solutions.java.kyu8.BrokenSequence;
import kata.solutions.java.kyu5.PaginationHelper;
import kata.solutions.java.kyu7.Block;
import kata.solutions.java.unsolved.Powers;
import kata.solutions.java.unsolved.Reverse;
import kata.solutions.java.unsolved.ReverseLonger;
import kata.solutions.java.unsolved.Sequence;
import kata.solutions.java.kyu6.Persist;
import kata.solutions.java.kyu5.WeightSort;
import kata.solutions.java.kyu6.FrogJumping;
import kata.solutions.java.unsolved.Lucas;
import kata.solutions.java.kyu5.Scramblies;

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
        System.out.println(StringMerger.isMerge("codewars", "code", "wars"));
        System.out.println(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
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
        //System.out.println(PigLatin.class.newInstance().translate("tes3t5"));
        /*Xbonacci variabonacci = new Xbonacci();
        double serie[] = variabonacci.tribonacci(new double []{1,1,1},10);
        for (int i = 0; i < serie.length; i++) System.out.print((int)serie[i] + ",");*/
        //System.out.print(EANValidator.validate("9783827317100"));
        //System.out.print(Ghost.class.newInstance().getColor());
        //System.out.print(kata.solutions.kyu6.Diamond.print(5));
        //System.out.println(TriangleNumbers.isTriangleNumber(125250));
        //System.out.println(Converter.mpgToKPM(880));
        //System.out.println(Factorial.class.newInstance().factorial(42));
        //System.out.println(KataExampleTwist.kataExampleTwist());
        //System.out.println(Bio.class.newInstance().dnaToRna("TTTT"));
        //System.out.println(Circle.area(3));
        /*int serie[] = SequenceSum.sumOfN(-5);
        for (int i : serie) System.out.println(i + ",");*/
        //System.out.println(SquareDigit.class.newInstance().squareDigits(9119));
        /*String[] quotes = { "Quote Hidden in example test","Holy haberdashery, Batman!","Quote Hidden in example test"};
        System.out.println(BatmanQuotes.getQuote(quotes, "Rob1n"));*/
        /*String[] test1 = {"home", "milk", "Mercury", "fish"};
        for (String s : WordSearch.findWord("me", test1)) System.out.println(s);*/
        //System.out.println(Square.isSquare(164207796));
        //System.out.println("Reversed " + Reverse.class.newInstance().reverse("YC"));
        //System.out.println(CompleteThePattern.pattern(5));
        //System.out.println(BinaryCalculator.calculate("1", "1", "add"));
        //System.out.println(ReverseLonger.shorterReverseLonger("2f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a04592f63a9e0-3269-4968-bc4c-5ddee96a0459", "67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b67419887-79e8-4d90-9b24-2f6d1af37e8b") + "\nbauollehbau");
        //System.out.println(PlayPass.playPass("IN 2012 TWO CAMBRIDGE UNIVERSITY RESEARCHERS ANALYSED PASSPHRASES FROM THE AMAZON PAY SYSTEM...", 1));
        //System.out.println(BrokenSequence.class.newInstance().findMissingNumber("2 3 4 5"));
        /*System.out.println("PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);");
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println("helper.pageCount() " + helper.pageCount() + " == 2");
        System.out.println("helper.itemCount() " + helper.itemCount() + " == 6");
        System.out.println("pageItemCount(0) " + helper.pageItemCount(0) + " == 4");
        System.out.println("pageItemCount(1) " + helper.pageItemCount(1) + " == 2");
        System.out.println("pageItemCount(2) " + helper.pageItemCount(2) + " == -1");
        System.out.println("helper.pageIndex(5) " + helper.pageIndex(5) + " == 1");
        System.out.println("helper.pageIndex(2) " + helper.pageIndex(2) + " == 0");
        System.out.println("helper.pageIndex(20) " + helper.pageIndex(20) + " == -1");
        System.out.println("helper.pageIndex(-10) " + helper.pageIndex(-10) + " == -1");*/
        
        /*Block b = new Block(new int[]{2,4,6});
        System.out.println("volume " + b.getVolume());
        System.out.println("area " + b.getSurfaceArea());*/
        //System.out.println("Torna 32 = " + Powers.powers(new int[]{1,2,3,4,5}));
        //System.out.println(Sequence.nthterm(0, 99, 1));
        //System.out.println(Persist.persistence(999));
        //System.out.println(WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        //System.out.println(FrogJumping.solution(new int[]{1, 2, 1, 2, -3, -4}));
        //System.out.println(Lucas.lucasnum(-10));
        
        /*System.out.println(Scramblies.scramble("rkqodlw","world"));
        System.out.println(Scramblies.scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(Scramblies.scramble("katas","steak"));
        System.out.println(Scramblies.scramble("scriptjavx","javascript"));
        System.out.println(Scramblies.scramble("scriptingjava","javascript"));
        System.out.println(Scramblies.scramble("scriptsjava","javascripts"));
        System.out.println(Scramblies.scramble("javscripts","javascript"));
        System.out.println(Scramblies.scramble("aabbcamaomsccdd","commas"));
        System.out.println(Scramblies.scramble("commas","commas"));
        System.out.println(Scramblies.scramble("sammoc","commas"));*/
       
        /**
         * testing(Scramblies.scramble("rkqodlw","world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scramblies.scramble("katas","steak"),false);
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
        testing(Scramblies.scramble("scriptingjava","javascript"),true);
        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
        testing(Scramblies.scramble("javscripts","javascript"),false);
        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scramblies.scramble("commas","commas"),true);
        testing(Scramblies.scramble("sammoc","commas"),true);
         */
    }
}
