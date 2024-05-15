package chap07;

import java.util.Scanner;

abstract class Echoer {
    void start() {
        System.out.println("시작합니다.");
    }
    abstract void echo();

    void stop() {
        System.out.println("종료합니다.");
    }
}
public class programming08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echoer() {
            @Override
            void echo() {
                String print = "a";
                while(!(print.equals("끝"))) {
                    print = in.nextLine();
                    System.out.println(print);
                }
            }
        };
        e.start();
        e.echo();
        e.stop();
    }
}
