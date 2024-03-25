package chap03;

public class programming08 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        int result = 1;
        return switch (n) {
            case 1 -> 1;
            default -> {
                do {
                    result *= n;
                    n--;
                } while (n > 0);
                yield result;
            }
        };
    }
}
