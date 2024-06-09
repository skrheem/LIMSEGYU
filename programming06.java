package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Population {
    String name;
    double pop;
    Population(String name, double pop) {
        this.name = name;
        this.pop = pop;
    }
    String getName() {
        return name;
    }
    double getPop() {
        return pop;
    }
    @Override
    public String toString() {
        return name + "(" + pop + ")";
    }
}
public class programming06 {
    static int a = 0;
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던"));
        ArrayList<Double> populations = new ArrayList<>(List.of(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9));

        Stream<Population> populationStream = IntStream.range(a, names.size())
                .mapToObj(i -> new Population(names.get(i), populations.get(i)));

        populationStream.filter(Population -> Population.getPop() > 300.0).forEach(System.out::println);
    }
}
