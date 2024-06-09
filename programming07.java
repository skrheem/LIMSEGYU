package chap12;

import java.util.*;

public class programming07 {
    public static void main(String[] args) {
        List<String> list = List.of("민국", "지우", "하준", "지우", "하준", "지우");
        Map<String, Integer> map = new HashMap<>();
        for(String s : list) {
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        System.out.println(map);
    }
}
