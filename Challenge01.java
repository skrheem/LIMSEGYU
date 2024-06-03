package chap09;

import java.util.Arrays;

class EnglishScore implements Comparable<EnglishScore>{
    String name;
    int score;
    EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
    @Override
    public int compareTo(EnglishScore e) {
        if(this.score > e.score) {
            return this.score;
        }
        else
            return e.score;
    }
}
class MathScore implements Comparable<MathScore>{
    String name;
    int score;
    MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
    @Override
    public int compareTo(MathScore e) {
        if(this.score < e.score) {
            return this.score;
        }
        else
            return e.score;
    }
}
public class Challenge01 {
    static <T extends Comparable<T>> T findBest(T[] a) {
        T best = a[0];
        for (T ea : a) {
            if(ea.compareTo(best) >= 0)
                best = ea;
        }
        return best;
    }
    static <T> T findScore(T[] a, String name) {
        T find = a[0];
        for(T ea : a) {
            if(ea.toString().substring(0, 3).equals(name)) {
                find = ea;
            }
        }
        return find;
    }
    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓", 77),
        new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99)};

        MathScore[] ma = { new MathScore("홍길동", 70), new MathScore("김삿갓", 80),
                new MathScore("장영실", 98)};

        String name = null;

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));

        if (args.length == 0) {
            System.out.println("명령행 인자가 없습니다.");
            return;
        }

        System.out.println("영어      점수 : " + findScore(ea, name));
        System.out.println("수학      점수 : " + findScore(ma, name));
    }
}
