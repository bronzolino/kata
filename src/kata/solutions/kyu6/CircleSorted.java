package kata.solutions.kyu6;

/**
 * 
 * Circularly Sorted Array
 * 
 * Write a method, isCircleSorted(int[] A) (Java, JavaScript), or 
 * Array#circularly_sorted? (Ruby) that determines if A is circularly sorted.
 * An Array is circularly sorted if the elements are sorted in ascending order,
 * but displaced, or rotated, by any number of steps.
 * 
 * For Example:
 * 
 * // True:
 * isCircleSorted([2,3,4,5,0,1]);
 * isCircleSorted([4,5,6,9,1]);
 * isCircleSorted([10,11,6,7,9]);
 * isCircleSorted([1,2,3,4,5]);
 * isCircleSorted([5,7,43,987,-9,0]);
 * 
 * // False:
 * isCircleSorted([4,1,2,5]);
 * isCircleSorted([8,7,6,5,4,3]);
 * isCircleSorted([6,7,4,8]);
 * isCircleSorted([7,6,5,4,3,2,1]);
 */
public class CircleSorted {


    public boolean isCircleSorted(int[] a) {
        int len = a.length;
        int startPoint = 0;
        int restartPoint = 0;
        for (int i = 1; i < len; i++) {
            if (a[i] < a[i-1]) startPoint = i;
        }
        System.out.println("Controllo su StartPoint : " + startPoint);
        if (startPoint != 0 && a[startPoint] > a[0]) return false;
        for (int i = startPoint + 1; i < len; i++) {
            System.out.println("Controllo i=" + i + " finché len=" + len);
            System.out.println("Dato che  a[" + i + "]=" + a[i] + " e a[" + (i -1) +"]=" + a[i - 1]);
            if (a[i] < a[i - 1]) return false;
        }
        System.out.println("Riparto da zero");
        for (int i = 0 ; i < startPoint - 1; i++) {
            System.out.println("Controllo i=" + i + " finché len=" + startPoint);
            System.out.println("Dato che  a[" + (i + 1) + "]=" + a[i + 1] + " e a[" + i +"]=" + a[i]);
            if (a[i + 1] < a[i]) return false;
        }
        return true;
    }
}