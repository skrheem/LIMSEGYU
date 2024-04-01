package chap04;

class Complex {
    double real;
    double imaginary;
    Complex(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}
public class programming06 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();

    }
}
