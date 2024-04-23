package chap06;

class Person {
    String name;
    int age;
    Person() {
        name = "임세규";
        age = 26;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    void show() {
        System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}
class Student extends Person {
    int stdNum;
    Student() {
        name = "임세규";
        age = 26;
        stdNum = 18102101;
    }
    Student(String name, int age, int stdNum) {
        super(name, age);
        this.stdNum = stdNum;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    int getStdNum() {
        return stdNum;
    }
    void show() {
        System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + stdNum + "]");
    }
}
class ForeignStudent extends Student {
    String nationality;
    ForeignStudent() {
        name = "Steve um";
        age = 26;
        stdNum = 18102207;
        nationality = "U.S.A";
    }
    ForeignStudent(String name, int age, int stdNum, String nationality) {
        super(name, age, stdNum);
        this.nationality = nationality;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    int getStdNum() {
        return stdNum;
    }
    String getNationality() {
        return nationality;
    }
    void show() {
        System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + stdNum + ", 국적 : " + nationality + "]");
    }
}
public class programming02 {

    public static void main(String[] args) {
        Person[] people = { new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200, "U.S.A")};
        for(Person p : people) {
            p.show();
        }
    }
}
