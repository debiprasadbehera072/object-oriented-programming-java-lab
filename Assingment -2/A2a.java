import java.lang.*;

class A2a {
    public static void main(String args[]) {
        int num = 510;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
