import java.util.Scanner;

class QUESTION7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Year :");
        int num = sc.nextInt();

        if(num>=2000)
        {
            System.out.println("Year is Greater than 2000");
        }
        else
        {
            System.out.println("Year is Lesser than 2000");
        }

        sc.close();
    }
}
