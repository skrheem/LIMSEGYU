package chap11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class programming07 {
    public static void main(String[] args) {
        String[] s1 = {"a","b","a","b","c"};
        String[] s2 = {"c"};

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.print("set1과 set2는 같다 : ");
        System.out.println(set1.equals(set2) ? "true" : "false");
        System.out.print("set1은 set2의 모든 원소를 포함한다 : ");
        System.out.println(set1.containsAll(set2) ? "true" : "false");
        set1.addAll(set2);
        System.out.println("합집합 : " + set1);
        set1.retainAll(set2);
        System.out.println("교집합 : " + set1);

    }
}
