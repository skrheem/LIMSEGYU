package chap11;

import java.util.*;

public class Challenge02 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for(int t = 0; t < 6; t++) {
            String key = in.nextLine();
            String value = in.nextLine();
            dic.put(key, value);
        }

        for(String key : dic.keySet()) {
            System.out.printf("%s=%s ", key, dic.get(key));
        }
        System.out.println();

        List<String> list = new ArrayList<>(dic.values());

        Collections.shuffle(list);

        list.forEach(x -> System.out.print(x + " "));

    }
}