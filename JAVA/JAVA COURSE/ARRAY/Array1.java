import java.util.Scanner;

public class Array1 
{
    public static void main(String[] args) 
    {
        int Arr[]  = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }

        for(i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
        sc.close();
    }
}
