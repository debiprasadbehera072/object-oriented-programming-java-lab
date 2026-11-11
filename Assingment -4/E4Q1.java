import java.lang.*;
import java.util.*;

class E4Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficient A");
        double a = sc.nextDouble();
        System.out.println("Enter coefficient B");
        double b = sc.nextDouble();
        System.out.println("Enter coefficient C");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation");
        }
        else {
            double d = (b * b) - (4 * a * c);

            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Two distinct real roots");
                System.out.println("Root 1 = " + r1);
                System.out.println("Root 2 = " + r2);
            }
            else if (d == 0) {
                double r = -b / (2 * a);
                System.out.println("Two equal real roots");
                System.out.println("Root : " + r);
            }
            else {
                System.out.println("The roots are imaginary");
            }
        }
        sc.close();
    }
}
