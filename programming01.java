package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class programming01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
            list.add(in.nextLine());
        for (String s:list) {
            if(s.length() == 2)
                System.out.print(s + " ");
        }
    }
}
