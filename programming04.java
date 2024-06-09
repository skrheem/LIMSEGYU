package chap12;

import java.util.*;
import java.util.stream.*;

public class programming04 {
    public static void main(String[] args) {
        Stream<Nation> nationStream = Nation.nations.stream();
        System.out.println(nationStream.map(Nation::getName).collect(Collectors.joining(", ")));

    }
}
