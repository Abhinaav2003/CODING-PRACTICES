import java.util.Scanner;

public class QUESTION9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Number :");
        int num = sc.nextInt();

        if(num==0)
        {
            System.out.println("Number is Zero");
        }
        else if(num<0)
        {
            System.out.println("Number is Not Zero");
        }
        sc.close();
    }
}
