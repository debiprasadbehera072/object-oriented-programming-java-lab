import java.util.*;

class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element");
        int ele = sc.nextInt();
        int c = 0;
        int mid;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            mid = (i + j) / 2;
            if (a[mid] == ele) {
                System.out.println("Element Found " + mid);
                c++;
                break;
            }
            else if (a[mid] > ele) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        if (c == 0) {
            System.out.println("Element not Found");
        }
    }
}
