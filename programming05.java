package chap11;

import java.util.*;

public class programming05 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int score = 1;
        int best = 0;
        while(score > 0) {
            score = in.nextInt();
            if(score > 0)
                array.add(score);
        }
        System.out.println("전체 학생은 " + array.size() + "명이다.");
        for(int i : array) {
            System.out.print("학생들의 성적 : ");
            System.out.println(i + " ");
            if(i > best)
                best = i;
        }
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) > best - 10)
                System.out.println(i + "번 학생의 성적은 " + array.get(i) + "이며 등급은 A이다.");
            else if (array.get(i) >= best - 20 && array.get(i) < best - 10)
                System.out.println(i + "번 학생의 성적은 " + array.get(i) + "이며 등급은 B이다.");
            else
                System.out.println(i + "번 학생의 성적은 " + array.get(i) + "이며 등급은 C이다.");
        }
    }
}
