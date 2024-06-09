package chap11;

import java.util.HashMap;
import java.util.Map;

public class programming06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("호랑이", "tiger");
        map.put("표범", "leopart");
        map.put("사자", "lion");

        System.out.println("변경 전 : " + map);
        map.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("변경 후 : " + map);
    }
}
