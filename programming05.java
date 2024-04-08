package chap05;
import java.util.*;
public class programming05 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("숫자를 10개 입력하세요.");
            int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0;
            for(int i = 0; i < 10; i++) {
                int input = in.nextInt();
                if(input < 0)
                    continue;
                switch (input / 10) {
                    case 0:
                        zero++;
                        break;
                    case 1:
                        one++;
                        break;
                    case 2:
                        two++;
                        break;
                    case 3:
                        three++;
                        break;
                    case 4:
                        four++;
                        break;
                    case 5:
                        five++;
                        break;
                    case 6:
                        six++;
                        break;
                    case 7:
                        seven++;
                        break;
                    case 8:
                        eight++;
                        break;
                    case 9:
                        nine++;
                        break;
                    default:
                        break;
                }
            }
            System.out.print("0 ~ 9 : ");
            for(int i = 0; i < zero; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("10 ~ 19 : ");
            for(int i = 0; i < one; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("20 ~ 29 : ");
            for(int i = 0; i < two; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("30 ~ 39 : ");
            for(int i = 0; i < three; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("40 ~ 49 : ");
            for(int i = 0; i < four; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("50 ~ 59 : ");
            for(int i = 0; i < five; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("60 ~ 69 : ");
            for(int i = 0; i < six; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("70 ~ 79 : ");
            for(int i = 0; i < seven; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("80 ~ 89 : ");
            for(int i = 0; i < eight; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("90 ~ 99 : ");
            for(int i = 0; i < nine; i++){
                System.out.print("*");
            }
            System.out.println();
        }
}
