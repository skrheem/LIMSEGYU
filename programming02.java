package chap07;

interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}

interface Delicious extends Edible, Sweetable {
}

public class programming02 implements Delicious {
    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void sweet() {
        System.out.println();
    }

    public static void main(String[] args) {
        programming02 prg = new programming02();
        prg.eat();
        prg.sweet();
    }
}