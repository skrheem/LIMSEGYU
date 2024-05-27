package chap08;
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public boolean equals(Circle c) {
        return this.radius == c.radius;
    }
}
public class programming01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        if(c1.equals(c2))
            System.out.println("c1과 c2는 같다.");
        else
            System.out.println("c1과 c2는 다르다.");
    }
}
