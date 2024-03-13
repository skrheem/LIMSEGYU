import java.util.Scanner;

public class programming08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int input = in.nextInt();
        int hundread = (input / 100);
        int ten = (input - hundread * 100) / 10;
        int one = input - (ten * 10 + hundread * 100);
        int sum = hundread + ten + one;
        System.out.println("각 자릿수의 합 = " + sum);
    }
}
