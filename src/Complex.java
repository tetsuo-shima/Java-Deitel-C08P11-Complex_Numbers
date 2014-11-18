/**
 * Created by dwight on 11/18/14.
 */
public class Complex {
    private double realNumber;
    private double imaginaryNumber;

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex complex) {
        this(complex.realNumber, complex.imaginaryNumber);
    }

    public Complex(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public Complex add(Complex number) {
        return new Complex((realNumber + number.realNumber), (imaginaryNumber + number.imaginaryNumber));
    }

    public Complex subtract(Complex number) {
        return new Complex((realNumber - number.realNumber), (imaginaryNumber - number.imaginaryNumber));
    }

    public String toString(){
        return "(" + realNumber + ", " + imaginaryNumber + ")";
    }
}
