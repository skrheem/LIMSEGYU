package chap07;
interface Human {
    void print();
    void eat();
    static void echo() {
        System.out.println("야호!!!");
    }
}
class Worker implements Human {
    public void print() {
        System.out.println("인간입니다.");
    }
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
    public void echo() {
        System.out.println("야호!!!");
    }
}
class Student implements Human {
    int age;
    Student(int age) {
        this.age = age;
    }
    public void print() {
        System.out.println(age + "세의 학생입니다.");
    }
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }
    public void echo() {
        System.out.println("야호!!!");
    }
}
public class programming06 {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Human p = new Worker();
        p.print();
        p.eat();
    }
}
