import java.util.*;

class Q1 {
    public static void main(String args[]) {
        int i;
        int j;

        for (i = 0; i < 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
