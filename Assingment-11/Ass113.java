import java.util.Scanner;

class Ass113
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.print(ch + " : ");

            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == ch)
                {
                    System.out.print(i + "\n ");
                }
            }

            System.out.println();
        }
    }
}