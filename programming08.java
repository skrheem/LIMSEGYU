package chap04;
class Dice {
    private int face;
    final int min = 1;
    final int max = 6;

    Dice() {
        this.face = (int) (Math.random() * (max - min + 1)) + min;
    }
    public int roll() {
        return face;
    }
}
public class programming08 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());

    }
}
