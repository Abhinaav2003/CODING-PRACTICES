import java.util.Scanner;

public class QUESTION5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        int Age = sc.nextInt();

        if(Age>=18)
        {
            System.out.println("Eligible for Vote");
        }
        else
        {
            System.out.println("Not Eligible for Vote");
        }
        sc.close();
    }
}
