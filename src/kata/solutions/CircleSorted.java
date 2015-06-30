package kata.solutions;

/**
 * Ordinamento circolare
 * 3,7,10,1 [OK]
 * 7,3,10,1 [KO]
 * @author gabriele
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