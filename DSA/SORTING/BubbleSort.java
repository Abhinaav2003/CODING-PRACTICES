package DSA.SORTING;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int arr[] = {5, 3, 8, 4, 2};
        int n = arr.length;

        // Bubble Sort Logic
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
