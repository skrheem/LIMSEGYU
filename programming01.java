package chap07;
abstract class Abstract {
    int i;
    void show(){};
}
class Concrete extends Abstract {
    int j;
    Concrete(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show() {
        System.out.printf("%d %d",i, j);
    }
}
public class programming01 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
