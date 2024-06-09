package chap12;

import java.util.HashSet;
import java.util.Set;

public class programming09 {
    public static void main(String[] args) {
        int count = 5;
        Pytha(count).forEach(triplet -> System.out.println("(" + triplet[0] + "," + triplet[1] + "," + triplet[2] + ")"));
    }

    public static Set<int[]> Pytha(int count) {
        Set<int[]> triplets = new HashSet<>();
        int a, b, c;
        for (int m = 2; triplets.size() < count; m++) {
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (isPytha(a, b, c)) {
                    int[] triplet = new int[]{a, b, c};
                    triplets.add(triplet);
                }
            }
        }
        return triplets;
    }

    public static boolean isPytha(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }
}