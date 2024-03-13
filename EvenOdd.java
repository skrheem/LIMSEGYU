import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("정수를 입력하세요 : ");
        input = in.nextInt();
        System.out.print((input%2==0)?"짝수":"홀수");
    }
}
