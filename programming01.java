package chap12;
import java.util.*;
public class programming01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");
        list.stream().filter(s->s.length() == 2).forEach(s -> System.out.println(s));
    }
}
