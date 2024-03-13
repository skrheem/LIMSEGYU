import java.util.Scanner;

public class programming04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요 : ");
        int input = in.nextInt();
        int hour = input / 3600;
        int minute = (input - (hour * 3600)) / 60;
        int second = (input - (hour * 3600)) - (minute * 60);
        System.out.println(hour + "시간 " + minute + "분 " + second + "초");
    }
}
