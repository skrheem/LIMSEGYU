package chap04;

class GolfClub {
    private String name;
    GolfClub(){
        this.name = "7번 아이언";
    }
    GolfClub(String name) {
        this.name = name;
    }
    GolfClub(int name) {
        this.name = name + "번 아이언";
    }
    public void print() {
        System.out.println(this.name + "입니다.");
    }
}

public class programming07 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();
        GolfClub g2 = new GolfClub(8);
        g2.print();
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
