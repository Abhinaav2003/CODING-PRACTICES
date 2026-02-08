import java.util.Scanner;

public class QUESTION2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter an Number :");
        num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
