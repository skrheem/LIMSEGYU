package chap03;

import java.util.Scanner;

public class programming06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("철수 : ");
        String chelsoo = in.nextLine();
        System.out.print("영희 : ");
        String yeonghee = in.nextLine();
        if(chelsoo.equals("r")) {
            if(yeonghee.equals("r"))
                System.out.println("무승부");
            if(yeonghee.equals("s"))
                System.out.println("철수, 승!");
            if(yeonghee.equals("p"))
                System.out.println("영희, 승!");
        }
        if(chelsoo.equals("s")) {
            if(yeonghee.equals("s"))
                System.out.println("무승부");
            if(yeonghee.equals("p"))
                System.out.println("철수, 승!");
            if(yeonghee.equals("r"))
                System.out.println("영희, 승!");
        }
        if(chelsoo.equals("p")) {
            if(yeonghee.equals("p"))
                System.out.println("무승부");
            if(yeonghee.equals("r"))
                System.out.println("철수, 승!");
            if(yeonghee.equals("s"))
                System.out.println("영희, 승!");
        }
    }
}
