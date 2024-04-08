package chap05;

import java.util.Arrays;

public class programming07 {
    public static void main(String[] args) {
        int[] a = {3,2,4,1,5};
        int[] b = {3,2,4,1};
        int[] c = {3,2,4,1,5};
        int[] d = {2,7,1,8,2};
        System.out.println("a와 b를 비교 : " + arrayTest(a, b));
        System.out.println("a와 c를 비교 : " + arrayTest(a, c));
        System.out.println("a와 d를 비교 : " + arrayTest(a, d));
        System.out.println("b와 c를 비교 : " + arrayTest(b, c));
        System.out.println("b와 d를 비교 : " + arrayTest(b, d));
        System.out.println("c와 d를 비교 : " + arrayTest(c, d));
    }
    public static boolean arrayTest(int[] a, int[] b) {
        int True = 0;
        for(int i = 0; i < a.length; i++) {
            if(Arrays.equals(a, b))
                True++;
        }
        if(True == a.length)
            return true;
        else
            return false;
    }
}
