package chap08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class programming06 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy.MM.dd a k:m:s", Locale.KOREA);
        System.out.println(f1.format(c.getTime()));
        SimpleDateFormat f2 = new SimpleDateFormat("오늘은 M월의 dd번째 날", Locale.KOREA);
        System.out.println(f2.format(c.getTime()));
        SimpleDateFormat f3 = new SimpleDateFormat("오늘은 yyyy년의 D번째 날", Locale.KOREA);
        System.out.println(f3.format(c.getTime()));
    }
}
