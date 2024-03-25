package chap03;

import java.util.Scanner;

public class programming01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요 : ");
        int n = in.nextInt();
        if(n >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");
    }
}
