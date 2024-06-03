package chap09;
class Pair<T> {
    T first;
    T second;
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    T first() {
        return first;
    }
    T second() {
        return second;
    }
}
public class programming04 {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10, 20);
        Pair<Double> p2 = new Pair<>(10.0, 20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}
