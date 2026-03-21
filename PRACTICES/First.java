import java.util.Scanner;

public class First
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[3];
        int i;

        for(i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}