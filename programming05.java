import java.util.Scanner;

public class programming05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = 'c';
        System.out.println("소문자 " + c + "의 대문자는 " + (char)((int)c - 32));
    }
}
