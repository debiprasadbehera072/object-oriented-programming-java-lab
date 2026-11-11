import java.lang.*;

class Assc1Area {
    public static void main(String args[]) {
        double length = 6.0, breadth = 3.0, height = 2.0;

        double aRectangle = length * breadth * height;
        double aCube = length * length * length;
        double aSquare = length * length;

        System.out.println("Volume of Rectangle: " + aRectangle);
        System.out.println("Volume of Cube: " + aCube);
        System.out.println("Volume of Square: " + aSquare);
    }
}
