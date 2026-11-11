import java.lang.*;

class Ass04bitwise {
    public static void main(String args[]) {
        int a = 70, b = 80;

        System.out.println("Before swap: a=" + a + ", b=" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a=" + a + ", b=" + b);
    }
}
