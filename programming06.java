import java.util.Scanner;

public class programming06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double F;
        System.out.print("화씨온도를 입력해 주세요 : ");
        F = in.nextDouble();
        double C = (F - 32) * 5 / 9;
        System.out.println("섭씨온도 : " + C);
    }
}
