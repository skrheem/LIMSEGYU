package chap04;
class Printer {
    private int numOfPapers;
    private boolean duplex;
    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }
    public void print(int amount) {
        if(duplex) {
            amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
            if(numOfPapers == 0)
                System.out.println("용지가 없습니다.");
            else if(amount > numOfPapers) {
                System.out.println("양면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0;
            }
            else {
                numOfPapers = numOfPapers - amount;
                System.out.println("양면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        }
        else {
            if(numOfPapers == 0)
                System.out.println("용지가 없습니다.");
            else if(amount > numOfPapers) {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0;
            }
            else {
                numOfPapers = numOfPapers - amount;
                System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        }
    }
    public boolean getDuplex() {
        return this.duplex;
    }
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
public class PrinterTest {

    public static void main(String[] args) {
        Printer printer = new Printer(20, true);
//        printer.numOfPapers = 100;
        printer.print(25);
        printer.setDuplex(false);
        printer.print(10);
    }
}
