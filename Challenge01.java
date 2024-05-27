package chap08;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;

class Car {
    String name;
    String driver = "홍길동";
    Car(String name) {
        this.name = name;
    }
    public void equals(Car car) {
        if(Objects.equals(this.name, car.name)) {
            System.out.println("자동차 모델이 둘 다 [" + this.name + "]로 동일하다.");
        }
        else
            System.out.println("내 자동차는 [" + this.name + "], 너 자동차는 [" + car.name + "]로 모델이 다르다.");
    }
    public void show() {
        SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy", Locale.KOREA);
        Calendar calendar = Calendar.getInstance();
        String s = MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", f.format(calendar.getTime()), this.name, this.driver);
        System.out.println("원본 문자열: " + s);
        StringTokenizer tokenizer = new StringTokenizer(s, " ,[]()=");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

}
public class Challenge01 {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");
//        if(myCar.equals(yourCar)) {
//            System.out.println("자동차 모델이 둘 다 [" + myCar.name + "]로 동일하다.");
//        }
//        else
//            System.out.println("내 자동차는 [" + myCar.name + "], 너 자동차는 [" + yourCar.name + "]로 모델이 다르다.");
        myCar.equals(yourCar);
        myCar.show();
    }
}
