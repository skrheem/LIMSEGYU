package chap09;

class Max<T> {
    Number max(Number t1, Number t2) {
        if(t1.doubleValue() > t2.doubleValue())
            return t1;
        else
            return t2;
    }
    String max(String t1, String t2) {
        if(t1.length() > t2.length())
            return t1;
        else
            return t2;
    }
}

public class programming06 {
    public static void main(String[] args) {
        Max<Number> n = new Max<>();
        System.out.println(n.max(10.0, 8.0));
        System.out.println(n.max(5, 8.0));

        Max<String> s = new Max<>();
        System.out.println(s.max("Hello","Hi"));
        System.out.println(s.max("Good", "morning"));
    }
}
