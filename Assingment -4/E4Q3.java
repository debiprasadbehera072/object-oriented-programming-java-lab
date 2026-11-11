import java.util.*;

class E4Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month: ");
        int m = sc.nextInt();
        System.out.println("Enter year");
        int y = sc.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if ((y % 400 == 0) || y % 4 == 0 && y % 100 != 0) {
                    System.out.println("29 Days");
                }
                else {
                    System.out.println("28 Days");
                }
                break;
            default:
                System.out.println("Invalid month");
        }
        sc.close();
    }
}
