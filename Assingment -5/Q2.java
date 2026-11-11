import java.util.*;

class Q2 {
    public static void main(String args[]) {
        int i = 1;
        double fact = 1;
        double e = 0;
        int n = 5;

        while (i <= n) {
            fact = fact * i;
            e = e + (1 / fact);
            i++;
        }
        System.out.println(e);
    }
}
