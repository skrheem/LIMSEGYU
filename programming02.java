import java.util.Scanner;
public class programming02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = in.nextInt();
        System.out.print(input + "의 제곱은 " + input * input);
    }
}
