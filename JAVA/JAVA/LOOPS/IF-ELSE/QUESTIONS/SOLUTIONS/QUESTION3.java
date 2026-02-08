import java.util.Scanner;

public class QUESTION3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter an Number :");
        num = sc.nextInt();

        if(num>100)
        {
            System.out.println("Number is Greater than 100");
        }
        else
        {
            System.out.println("Number is Lesser than 100");
        }
        sc.close();
    }
}
