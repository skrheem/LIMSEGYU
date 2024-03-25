package chap03;

public class programming05 {
    public static void main(String[] args) {
        for(int a = 1; a < 20; a++) {
            for(int b = 1; b < 20; b++) {
                for(int c = 1; c < 20; c++) {
                    if(a*a + b*b == c*c && a + b + c <= 20) {
                        // a = 1, b = 1, c = 1
                        //         ...
                        // a = 20, b = 20, c = 20
                        System.out.printf("%d, %d, %d", a, b, c);
                        System.out.println();
                    }
                }
            }
        }
    }
}
