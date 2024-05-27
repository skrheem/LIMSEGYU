package chap08;

import java.text.MessageFormat;

public class programming07 {
    public static void main(String[] args) {
        Object[][] data = {
                {"세종대왕", 1, "조선"},
                {"오바마", 2, "미국"},
                {"징기스칸", 3, "몽고"}
        };

        MessageFormat f = new MessageFormat("이름 : {0}       번호 : {1}       국적 : {2}");
        for (Object[] datum : data) {
            System.out.println(f.format(datum));
        }
    }
}
