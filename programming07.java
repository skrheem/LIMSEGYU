package chap03;

import java.util.Scanner;

public class programming07 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }
    public static String input(String rps) {
        Scanner in = new Scanner(System.in);
        System.out.print(rps + " : ");
        rps = in.nextLine();
        return rps;
    }
    public static void whosWin(String c, String y) {
        if(c.equals("r")) {
            if(y.equals("r"))
                System.out.println("무승부");
            if(y.equals("s"))
                System.out.println("철수, 승!");
            if(y.equals("p"))
                System.out.println("영희, 승!");
        }
        if(c.equals("s")) {
            if(y.equals("s"))
                System.out.println("무승부");
            if(y.equals("p"))
                System.out.println("철수, 승!");
            if(y.equals("r"))
                System.out.println("영희, 승!");
        }
        if(c.equals("p")) {
            if(y.equals("p"))
                System.out.println("무승부");
            if(y.equals("r"))
                System.out.println("철수, 승!");
            if(y.equals("s"))
                System.out.println("영희, 승!");
        }
    }
}
