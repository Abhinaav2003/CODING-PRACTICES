package DSA.SEARCHING;

// 2️⃣ Binary Search (Array Must Be Sorted)

class Binary_Search 
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};  // Sorted array
        int key = 40;

        int low = 0;
        int high = arr.length - 1;
        int position = -1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
            {
                position = mid;
                break;
            }
            else if (arr[mid] < key) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        if (position != -1)
            System.out.println("Element found at index: " + position);
        else
            System.out.println("Element not found");
    }
}

//🔹 Time Complexity:

// Best Case → O(1)
// Average/Worst → O(log n)

