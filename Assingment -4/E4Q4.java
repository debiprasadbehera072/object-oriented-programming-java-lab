import java.util.Scanner;

class E4Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is greatest");
        }
        else if (b > c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
        sc.close();
    }
}
