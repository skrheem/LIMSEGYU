package chap12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class programming08 {
    public static void main(String[] args) {
        Map<Nation.Type, Map<String, List<Nation>>> groupedNations = Nation.nations.stream().collect(Collectors.groupingBy(Nation::getType, Collectors.groupingBy(nation -> nation.getGdpRank() <= 12  ? "선진국" : "개도국")));
        System.out.println(groupedNations);
    }
}
