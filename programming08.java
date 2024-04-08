package chap05;
import java.util.*;
public class programming08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("요일을 입력해 주세요 : ");
        String day = in.nextLine();
        dayOfTheWeek.print(day.toLowerCase());

    }
    public enum dayOfTheWeek {
        월요일("MONDAY"),
        화요일("TUESDAY"),
        수요일("WEDNESDAY"),
        목요일("THURSDAY"),
        금요일("FRIDAY"),
        토요일("SATURDAY"),
        일요일("SUNDAY");

        private final String dayOfTheWeek;

        dayOfTheWeek(String s) {
            this.dayOfTheWeek = s;
        }
        public static void print(String day) {
            switch (day) {
                case "monday":
                    System.out.println("월요일은 싫다.");
                    break;
                case "tuesday":
                    System.out.println("화요일은 그저 그렇다.");
                    break;
                case "wednesday":
                    System.out.println("수요일은 그저 그렇다.");
                    break;
                case "thursday":
                    System.out.println("목요일은 그저 그렇다.");
                    break;
                case "friday":
                    System.out.println("금요일은 좋다.");
                    break;
                case "saturday":
                    System.out.println("토요일은 최고다.");
                    break;
                case "sunday":
                    System.out.println("일요일은 최고다.");
                    break;
            }
        }
    }
}
