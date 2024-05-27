package chap08;
import java.util.*;

public class programming08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        System.out.println("입력 : " + s);
        System.out.println("단어 개수 : " + stringTokenizer.countTokens());

        List<String> tokens = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            tokens.add(stringTokenizer.nextToken());
        }

        Collections.sort(tokens);

        // 정렬된 토큰 출력
        System.out.print("정렬된 토큰 : ");
        for (String token : tokens) {
            System.out.print(token + ", ");
        }
    }
}