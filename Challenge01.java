package chap11;
import java.util.*;
public class Challenge01 {
    public static void main(String[] args) {
        ArrayList<String> capitals = new ArrayList<>();
        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("파리");
        capitals.add("마드리드");
        for (String s:capitals) {
            System.out.print(s + " ");
        }
        capitals.add("런던");
        Iterator<String> i = capitals.iterator();
        System.out.println();
        while (i.hasNext()) {
            String s = i.next();
            System.out.print(s + " ");
            if(s.length()>=3)
                i.remove();
        }
        System.out.println();
        for(String s:capitals) {
            System.out.print(s + " ");
        }
    }
}
