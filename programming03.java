package chap04;

import java.util.Scanner;
class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    Member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
    public void setAllInfo(String name, String id, String pw, int age){
        System.out.println(this.name + " 님의 정보를 변경하겠습니다.");
        System.out.print(this.name + " -> ");
        this.name = name;
        System.out.println(this.name);

        System.out.print(this.id + " -> ");
        this.id = id;
        System.out.println(this.id);

        System.out.print(this.pw + " -> ");
        this.pw = pw;
        System.out.println(this.pw);

        System.out.print(this.age + " -> ");
        this.age = age;
        System.out.println(this.age);
    }
    public void setName(String name) {
        System.out.print("이름을 " + this.name + "에서 ");
        this.name = name;
        System.out.println(this.name + "(으)로 변경");
    }
    public void setID(String id) {
        System.out.print("아이디를 " + this.id + "에서 ");
        this.id = id;
        System.out.println(this.id + "(으)로 변경");
    }
    public void setPW(String pw) {
        System.out.print("비밀번호를 " + this.pw + "에서 ");
        this.pw = pw;
        System.out.println(this.pw + "(으)로 변경");
    }
    public void setAge(int age) {
        System.out.print("나이를 " + this.age + "세에서 ");
        this.age = age;
        System.out.println(this.age + "세로 변경");
    }
    public void getAllInfo(){
        System.out.println(this.name + "님의 모든 정보를 출력");
        System.out.println("이름 : " + this.name);
        System.out.println("아이디 : " + this.id);
        System.out.println("비밀번호 : " + this.pw);
        System.out.println("나이 : " + this.age);
    }
    public String getName() {
        return "당신의 이름은 " + this.name;
    }
    public String getID() {
        return "당신의 아이디는 " + this.id;
    }
    public String getPW() {
        return "당신의 비밀번호는 " + this.pw;
    }
    public String getAge() {
        return "당신의 나이는 " + this.age;
    }
}
public class programming03 {
    public static void main(String[] args) {
        Member member = new Member("임세규", "abc", "abc123", 26);
        member.getAllInfo();
        System.out.println(member.getName());
        System.out.println(member.getID());
        System.out.println(member.getPW());
        System.out.println(member.getAge());
        member.setAllInfo("김세규", "def", "def123", 36);
        member.getAllInfo();
        member.setName("박세규");
        System.out.println(member.getName());
        member.setID("ghi");
        System.out.println(member.getID());
        member.setPW("ghi123");
        System.out.println(member.getPW());
        member.setAge(16);
        System.out.println(member.getAge());
    }
}
