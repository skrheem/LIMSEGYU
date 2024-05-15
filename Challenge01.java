package chap07;

public class Challenge01 {


    public static void main(String[] args) {
        interface Countable {
            void count();
        }
        class Bird implements Countable {

            String name;
            public Bird(String name) {
                this.name = name;
            }
            @Override
            public void count() {
                System.out.println(name + "가 2마리 있다.");
            }

            public void fly() {
                System.out.println("2마리 " + name + "가 날아간다.");
            }
        }
        class Tree implements Countable {
            String name;
            public Tree(String name) {
                this.name = name;
            }
            @Override
            public void count() {
                System.out.println(name + "가 5그루 있다.");
            }
            public void ripen() {
                System.out.println(name + "에 열매가 잘 익었다.");
            }
        }
        Countable[] m = {new Bird("뻐꾸기"), new Bird("독수리"),
                            new Tree("사과나무"), new Tree("밤나무") };

        for(Countable e : m) {
            e.count();
        }
        for(int i = 0; i < m.length; i++) {
            if(m[i] instanceof Bird) {
                ((Bird) m[i]).fly();
            }
            else if(m[i] instanceof Tree) {
                ((Tree) m[i]).ripen();
            }
        }
    }
}
