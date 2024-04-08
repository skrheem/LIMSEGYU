package chap05;
import java.util.*;
public class programming04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("URL을 입력하세요 : ");
            String URL = in.nextLine();
            if(URL.equals("bye"))
                break;
            if(URL.endsWith("com")) {
                System.out.println(URL + "은 'com'으로 끝납니다.");
            }
            if(URL.contains("java")) {
                System.out.println(URL + "은 'java'를 포함합니다.");
            }
        }
    }
}
