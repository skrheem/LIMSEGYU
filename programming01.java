package chap05;

public class programming01 {
    public static void main(String[] args) {
        System.out.println("문자열에서 문자 a의 개수 : " + countChar("aaabbbcccaaaddd", 'a'));
    }
    public static int countChar(String s, char c) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
