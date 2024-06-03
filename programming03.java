package chap09;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class programming03 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showTokens(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        }
    }
    static String showTokens(String a, String b) {
        StringTokenizer stringTokenizer = new StringTokenizer(a, b);
        List<String> tokens = new ArrayList<>();
        while(true) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
