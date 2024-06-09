package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
public class programming02 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 10));
        set.add(new Person("나자바", 35));

        for (Person p:set) {
            System.out.println(p.toString());
        }
        Iterator<Person> i = set.iterator();
        System.out.println(set);
        while(i.hasNext())
            System.out.println(i.next());
    }
}
