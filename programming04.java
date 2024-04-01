package chap04;

class Car {
    String color;
    // static에 의해 모든 Car 객체가 공유한다.
    static int carNum;
    static int carRedNum;
    Car(String color) {
        this.color = color;
        if(color == "red"||color == "RED")
            carRedNum++;
        carNum++;
    }
    public static int getNumOfCar(){
        // static에 의해 인스턴스의 상태에 의존하지 않고 클래스 수준에서 작동한다.
        return carNum;
    }
    public static int getNumOfRedCar(){
        // static에 의해 인스턴스의 상태에 의존하지 않고 클래스 수준에서 작동한다.
        return carRedNum;
    }
}
public class programming04 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
