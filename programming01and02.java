package chap04;

class Triangle {
    double width;
    double height;
    double area;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double findArea() {
        area = (this.width * this.height) / 2;
        return area;
    }
    public boolean isSameArea(Triangle t) {
        return this.findArea() == t.findArea();
    }
}
public class programming01and02 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());

        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
