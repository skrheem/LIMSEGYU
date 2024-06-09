package chap12;

import java.util.*;
import java.util.stream.*;


enum Gender {남, 여}
class Member {
    String name;
    Gender gender;
    int age;
    Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    Member getInfo() {
        return new Member(this.name, this.gender, this.age);
    }
    @Override
    public String toString() {
        return "[Member(" + this.name + ", " + this.gender + ", " + this.age + ")";
    }
}
public class Challenge01 {
    static int a = 0;
    public static void main(String[] args) {
        List<String> names = List.of("홍길동","배장화","임꺽정","연흥부","김선달","황진이");
        names.stream().filter(s -> s.compareTo("이") > 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        names.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        Optional<String> firstElement = names.stream().findFirst();
        System.out.println(firstElement);
        firstElement.ifPresent(s -> System.out.println(s));
        System.out.println(names.stream().count());

        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        Optional<Integer> sum = ages.stream().reduce((integer, integer2) -> integer + integer2);
        sum.ifPresent(i -> System.out.println(i));

        Optional<Integer> max = ages.stream().max(Integer::compareTo);
        max.ifPresent(i -> System.out.println(i));

        Optional<Double> avg = ages.stream()
                .reduce((total, age) -> total + age)
                .map(total -> (double) total / ages.size());
        avg.ifPresent(i -> System.out.println(i));

        Stream<Member> memberStream = IntStream.range(a, names.size())
                .mapToObj(i -> new Member(names.get(i), genders.get(i), ages.get(i)));

        Map<Gender, List<Member>> groupedByGender = memberStream
                .collect(Collectors.groupingBy(member -> member.gender));
        
        groupedByGender.forEach((gender, member) -> {
            System.out.println(gender + " : ");
            member.forEach(System.out::print);
        });
    }

}
