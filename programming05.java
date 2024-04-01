package chap04;

class Line {
    private int length;
    Line(int length) {
        this.length = length;
    }

    public boolean isSameLine(Line line) {
        return this.length == line.length;
    }
}

public class programming05 {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        // line의 길이가 같은지 여부를 반환
        System.out.println(a.isSameLine(b));
        // 객체 a와 b는 서로 다른 객체이므로 false
        // ==는 참조하는 메모리 주소를 비교함.
        System.out.println(a == b);
    }
}
