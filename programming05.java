package chap07;
abstract class Controller {
    boolean power;
    void show(){}
    String getname() {
        return null;
    }
}
class TV extends Controller {
    TV(boolean power) {
        this.power = power;
    }
    void show() {
        if(power)
            System.out.println("TV가 켜졌습니다.");
        else
            System.out.println("TV가 꺼졌습니다.");
    }
}
class Radio extends Controller {
    Radio(boolean power) {
        this.power = power;
    }
    void show() {
        if(power)
            System.out.println("라디오가 켜졌습니다.");
        else
            System.out.println("라디오가 꺼졌습니다.");
    }
}
public class programming05 {
    public static void main(String[] args) {
        Controller[] c = {new TV(false), new Radio(true)};
        for(Controller controller : c) {
            controller.show();
        }
    }
}
