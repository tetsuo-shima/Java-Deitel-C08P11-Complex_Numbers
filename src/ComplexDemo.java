/**
 * Created by dwight on 11/18/14.
 */
public class ComplexDemo {

    public static void main(String[] args) {
        Complex com1 = new Complex(3, 5);
        Complex com2 = new Complex(12, 2);

        System.out.println(new Complex(com1.add(com2)));
        System.out.println(new Complex(com1.subtract(com2)));
        System.out.println(new Complex());
    }
}
