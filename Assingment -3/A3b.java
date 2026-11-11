import java.util.*;

class A3b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double GS, basic, HRA, DA;

        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();
        sc.close();

        HRA = basic * 0.1;
        DA = basic * 0.1;
        GS = basic + DA + HRA;

        System.out.println("Gross Salary Calculated: Rs" + GS);
    }
}
