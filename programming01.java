package chap09;
class MyDate {
    int year = 2035;
    int month = 12;
    int day = 25;
}
public class programming01 {
    public static void main(String[] args) {
        MyDate d = null;
        if(args.length == 0) {
            d = new MyDate();
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
            return;
        }
        System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
    }
}
