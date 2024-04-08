package chap05;

public class programming03 {
    public static void main(String[] args) {

        for(Direction d : Direction.values())
            System.out.printf(d + " ");

    }
    public enum Direction {

        동("동"),서("서"),남("남"),북("북");

        private final String direction;

        Direction(String d) {
            this.direction = d;
        }
    }
}
