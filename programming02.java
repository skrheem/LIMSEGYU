package chap08;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "학생[" + this.name + "]";
    }
}

public class programming02 {
    public static void main(String[] args) {
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍길동"));
    }
}
