package chap06;
class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}
class ColoredCircle extends Circle{
    String color;
    ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }
}
public class programming01 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");
        circle.show();
        coloredCircle.show();
    }
}
