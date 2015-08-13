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
import kata.solutions.kyu7.EANValidator;
import kata.solutions.kyu8.Ghost;
import kata.solutions.kyu6.TriangleNumbers;
import kata.solutions.unsolved.Converter;
import kata.solutions.kyu7.Factorial;
import kata.solutions.kyu8.God;
import kata.solutions.kyu8.KataExampleTwist;
import kata.solutions.kyu8.Bio;
import kata.solutions.unsolved.Circle;
import kata.solutions.kyu7.SequenceSum;
import kata.solutions.kyu7.SquareDigit;
import kata.solutions.kyu7.BatmanQuotes;
import kata.solutions.kyu7.WordSearch;
import kata.solutions.kyu7.Square;
import kata.solutions.kyu7.CompleteThePattern;
import kata.solutions.kyu7.BinaryCalculator;
import kata.solutions.kyu6.PlayPass;
import kata.solutions.kyu8.BrokenSequence;
import kata.solutions.kyu5.PaginationHelper;
import kata.solutions.kyu7.Block;
import kata.solutions.unsolved.Powers;
import kata.solutions.unsolved.Reverse;
import kata.solutions.unsolved.ReverseLonger;

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
        System.out.println("Torna 32 = " + Powers.powers(new int[]{1,2,3,4,5}));
        
    }
}
