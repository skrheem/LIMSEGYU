package chap03;

import java.util.Scanner;

public class challenge01 {
    public static void main(String[] args) {
        int result = 1;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = in.nextInt();
//        while(n > 0) {
//            result *= n;
//            n--;
//        }
        while(true) {
            result *= n;
            n--;
            if (n == 0)
                break;
        }

        System.out.println(result);
    }
}
