package chap03;

import java.util.Scanner;

public class programming10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if(isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }
    public static boolean isPrime(int num) {
        if(num==2||num==3||num==5||num==7)
            return true;
        else if(num > 1&&(!(num%2==0)&&!(num%3==0)&&!(num%5==0)&&!(num%7==0)))
            return true;
        else
            return false;
    }
}
