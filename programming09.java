import java.util.Scanner;

public class programming09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("전공 이수 학점 : ");
        int input1 = in.nextInt();
        System.out.print("교양 이수 학점 : ");
        int input2 = in.nextInt();
        System.out.print("일반 이수 학점 : ");
        int input3 = in.nextInt();
        System.out.println((input1 + input2 + input3 >= 140)&&((input1>=70)&&(input2 + input3 >= 80 || (input2 >= 30 && input3 >= 30)))?"졸업 가능" : "졸업 불가능");
    }
}
