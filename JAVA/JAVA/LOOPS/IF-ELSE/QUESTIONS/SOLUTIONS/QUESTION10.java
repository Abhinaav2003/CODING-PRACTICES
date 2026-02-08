import java.util.Scanner;

public class QUESTION10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();

        int answer = num1 / num2;

        System.out.println(answer);

        sc.close();
    }
}