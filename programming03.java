package chap03;

import java.util.Scanner;

public class programming03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int r = 0;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            n = in.nextInt();
            if(n % 2 == 0)
                r += n;
            else
                continue;
        } while (n > 0);
        System.out.print("입력한 양의 정수 중에서 짝수의 합은 " + r);
    }
}
