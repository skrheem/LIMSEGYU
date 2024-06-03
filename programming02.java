package chap09;

class Shape{}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class programming02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("Rectangle은 Circle의 하위 클래스가 아니기 때문에 변환할 수 없습니다.");
        }
    }
    static void casting(Shape s) {
        Circle c = (Circle) s;
    }
}


