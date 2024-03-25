package chap03;

import java.util.Scanner;

public class challenge02 {
    public static void main(String[] args) {
        int result = 1;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = in.nextInt();
        result = factorial(n);
        System.out.println(result);
    }
    static int factorial(int x) {
        int r = 1;
        while(true) {
            r *= x;
            x--;
            if (x == 0)
                break;
        }
        return r;
    }
}
