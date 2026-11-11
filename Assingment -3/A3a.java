import java.util.*;

class A3a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double s1, s2, s3, s4, s5, t, per;

        System.out.print("Enter subject-1 marks: ");
        s1 = sc.nextDouble();
        System.out.print("Enter subject-2 marks: ");
        s2 = sc.nextDouble();
        System.out.print("Enter subject-3 marks: ");
        s3 = sc.nextDouble();
        System.out.print("Enter subject-4 marks: ");
        s4 = sc.nextDouble();
        System.out.print("Enter subject-5 marks: ");
        s5 = sc.nextDouble();
        sc.close();

        t = s1 + s2 + s3 + s4 + s5;
        per = t / 5;

        System.out.println("Total Marks: " + t);
        System.out.println("Percentage: " + per);
    }
}
