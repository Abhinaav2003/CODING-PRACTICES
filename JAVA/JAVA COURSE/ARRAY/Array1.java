import  java.util.Scanner;

public class Array1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[10];
        int i;

        System.out.println("Enter Array Elements :");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Entered Array Elements :");
        for(i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

        sc.close();
    }
}
