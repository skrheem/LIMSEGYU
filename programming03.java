package chap07;

import java.util.Arrays;

class Book implements Comparable<Book> {
    int price;
    Book(int price) {
        this.price = price;
    }

    void printBook() {
        System.out.println(price);
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.price, other.price);
    }
}

public class programming03 {
    public static void main(String[] args) {
        Book[] bookArray = new Book[3];
        bookArray[0] = new Book(15000);
        bookArray[1] = new Book(50000);
        bookArray[2] = new Book(20000);

        System.out.println("정렬 전");
        for (Book book : bookArray) {
            book.printBook();
        }

        Arrays.sort(bookArray);

        System.out.println("정렬 후");
        for (Book book : bookArray) {
            book.printBook();
        }
    }
}