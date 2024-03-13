import java.util.Scanner;

public class programming03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은?");
        int radius = in.nextInt();
        System.out.print("원기둥의 높이는?");
        int height = in.nextInt();
        System.out.print("원기둥의 부피는 " + ((double)radius * (double)radius) * (double)height * 3.14);
    }
}
