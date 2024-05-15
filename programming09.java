package chap07;

import java.util.ArrayList;

class Hotel {
    ArrayList<Room> roomList = new ArrayList<>();
    static class Room {
        int number;
        String name;
        Room(int number, String name) {
            this.number = number;
            this.name = name;
        }
    }
    void add(int number, String name) {
        roomList.add(new Room(number, name));
    }
    void show() {
        for(Room r : roomList) {
            System.out.println(r.number + "번 방을 " + r.name + "가 예약했습니다.");
        }
    }
}
public class programming09 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.add(5, "호돌이");
        hotel.add(7, "길동이");
        hotel.show();
    }
}
