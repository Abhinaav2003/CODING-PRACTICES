package DSA.SORTING;

public class Selection_Sort 
{
    public static void main(String[] args) 
    {
        int arr[] = {5, 3, 8, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}

//   Algorithm	        Best	 Average	Worst
//   Selection Sort     O(n²)    O(n²)      O(n²)