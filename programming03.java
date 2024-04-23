package chap06;

class Point {
    private int x, y;
    Point() {}
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    public String toString() {
        return "x : " + x + " y : " + y;
    }
}
class MovablePoint extends Point {
    private int xSpeed, ySpeed;
    MovablePoint() {}
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    int getxSpeed() {
        return xSpeed;
    }
    int getySpeed() {
        return ySpeed;
    }
    public String toString() {
        return super.toString() + " xSpeed : " + xSpeed + " ySpeed : " + ySpeed;
    }
}
public class programming03 {
    public static void main(String[] args) {
        Point point = new Point(15,20);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(20,35,300,400);
        System.out.println(movablePoint);;
    }
}
