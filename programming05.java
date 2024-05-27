package chap08;
public class programming05 {
    static void show(Object O) {
        System.out.println(O);
    }
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
    }
}
