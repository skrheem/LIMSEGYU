package chap12;
import java.util.*;
public class programming02 {
    public static void main(String[] args) {
        List<String> list = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
        list.stream().sorted().findFirst().ifPresent(s -> System.out.println(s));
    }
}
