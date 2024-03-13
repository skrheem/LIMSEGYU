import java.util.Scanner;

public class programming07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력해 주세요 : ");
        int input = in.nextInt();
        System.out.println("정수 " + input + "은/는 4 그리고 5로 나누어 지는가? : " + ((input%4==0&&input%5==0)?"true":"false"));
        System.out.println("정수 " + input + "은/는 4 또는 5로 나누어 지는가? : " + ((input%4==0||input%5==0)?"true":"false"));
        System.out.println("정수 " + input + "은/는 4 또는 5로 나누어 지지만 두 수 모두로는 나누어 지지 않는가? : " + (!(input%4==0&&input%5==0)?"true":"false"));
    }
}
