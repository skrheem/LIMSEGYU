package chap09;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;
import java.util.ArrayList;
import java.util.List;

interface Animal {
    void sound();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍멍~~");
    }
}
class Cuckoo implements Animal {
    @Override
    public void sound() {
        System.out.println("뻐꾹뻐꾹~~");
    }
}
public class programming05 {
    static void printSound(List<? extends Animal> animals) {
        for(Animal animal : animals) {
            animal.sound();
        }
    }
    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }
}
