package chap06;

class Vehicle {
    String color;
    int speed;
    void show() {
        System.out.println("색상 : " + color + " 속도 : " + speed);
    }
    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}
class Car extends Vehicle {
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
    }

    void show() {
        System.out.println("색상 : " + color + " 속도 : " + speed + " 배기량 : " + displacement + " 기어 단수 : " + gears);
    }
}

public class programming06 {
    public static void main(String[] args) {
        Car c = new Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();

        Vehicle v = c;
        v.show();
    }
}
