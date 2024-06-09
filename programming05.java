package chap12;

import java.util.stream.*;
import java.util.*;
public class programming05 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        //System.out.println(stream.collect(Collectors.summarizingInt(Integer::intValue)).getSum());;
        List<Integer> intList1 = new ArrayList<>(stream1.toList());
        int sum = 0;
        for (int a:intList1) {
            sum += a;
        }
        sum = sum / intList1.size();
        intList1.clear();
        intList1.add(sum);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        List<Integer> intList2 = new ArrayList<>(stream2.toList());
        sum = 0;
        for(int a:intList2) {
            sum = sum + a * a;
        }
        sum = sum / intList2.size();
        intList2.clear();
        intList2.add(sum);

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
        List<String> intString = new ArrayList<>(stream3.map(String::valueOf).collect(Collectors.toList()));
        String S = "";
        for(String s:intString) {
            S = S.concat(s + "-");
        }
        List<String> stringList = List.of(S.substring(0, S.length() - 1));

        System.out.print("원소에 대한 평균 : ");
        intList1.forEach(System.out::print);
        System.out.println();
        System.out.print("원소의 제곱 값에 대한 평균 : ");
        intList2.forEach(System.out::print);
        System.out.println();
        System.out.print("각 원소에 하이픈('-')을 연결한 문자열 : ");
        stringList.forEach(System.out::print);
    }
}
