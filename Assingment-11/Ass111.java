import java.util.Scanner;

class Ass111
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int n;

        if(s1.length() < s2.length())
            n = s1.length();
        else
            n = s2.length();

        int flag = 0;

        for(int i = 0; i < n; i++)
        {
            if(s1.charAt(i) < s2.charAt(i))
            {
                System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
                flag = 1;
                break;
            }
            else if(s1.charAt(i) > s2.charAt(i))
            {
                System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            if(s1.length() < s2.length())
                System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
            else if(s1.length() > s2.length())
                System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
            else
                System.out.println("Both strings are equal");
        }
    }
}