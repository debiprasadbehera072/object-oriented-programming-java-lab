import java.util.Scanner;

class Ass112
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if(s1.length() != s2.length())
        {
            System.out.println("Strings are not same");
        }
        else
        {
            int flag = 0;

            for(int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
                System.out.println("Strings contain same data");
            else
                System.out.println("Strings do not contain same data");
        }
    }
}