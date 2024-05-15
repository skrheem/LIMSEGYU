package chap07;

interface Talkable {
    void talk();
}

class Korean implements Talkable {
    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {
    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}

public class programming04 {
    static void speak(Talkable talkable) {
        talkable.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}