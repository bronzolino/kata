package kata.solutions;

/**
 *
 *  Quanti tagli ci vogliono per spezzare la cioccolata
 *  di misura n x m
 * @author gabriele
 */
public class Chocolate{
    public static int breakChocolate(int n, int m) {
        /*if (n == 0 || m == 0) return 0;
        else if (n == 1) return m - 1;
        else if (m == 1) return n - 1;
        else return (n-1) * (m-1) * 2;*/
        if (n <= 1 && m <= 1) return -1;
        return ((n - 1) * m) + m - 1;
    }
}