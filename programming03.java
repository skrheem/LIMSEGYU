package chap12;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class programming03 {
    public static void main(String[] args) {
        IntStream range = IntStream.rangeClosed(1, 10);
        List<String> IntString = range.mapToObj(Integer::toString).toList();
        List<String> concatString = new ArrayList<>();
        for(String s : IntString) {
            String a = "A" + s;
            concatString.add(a);
        }
        for(String s : concatString) {
            System.out.print(s + " ");
        }
    }
}
