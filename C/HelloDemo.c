#include<stdio.h>

// ----------- DISPLAY FUNCTION -----------
void display(int arr[], int n) {
    for(int i=0;i<n;i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// ----------- BUBBLE SORT -----------
void bubbleSort(int arr[], int n) {
    for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}

// ----------- SELECTION SORT -----------
void selectionSort(int arr[], int n) {
    for(int i=0;i<n-1;i++) {
        int min = i;
        for(int j=i+1;j<n;j++)
            if(arr[j] < arr[min])
                min = j;

        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}

// ----------- INSERTION SORT -----------
void insertionSort(int arr[], int n) {
    for(int i=1;i<n;i++) {
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}

// ----------- MERGE SORT -----------
void merge(int arr[], int l, int m, int r) {
    int i=l, j=m+1, k=0;
    int temp[50];

    while(i<=m && j<=r) {
        if(arr[i] < arr[j])
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }

    while(i<=m)
        temp[k++] = arr[i++];

    while(j<=r)
        temp[k++] = arr[j++];

    for(i=l, k=0;i<=r;i++,k++)
        arr[i] = temp[k];
}

void mergeSort(int arr[], int l, int r) {
    if(l<r) {
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}

// ----------- QUICK SORT -----------
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low-1;

    for(int j=low;j<high;j++) {
        if(arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
}

void quickSort(int arr[], int low, int high) {
    if(low<high) {
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
}

// ----------- MAIN FUNCTION -----------
int main() {
    int arr[50], n, choice;

    printf("Enter number of elements: ");
    scanf("%d",&n);

    printf("Enter elements:\n");
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);

    printf("\n1. Bubble Sort");
    printf("\n2. Selection Sort");
    printf("\n3. Insertion Sort");
    printf("\n4. Merge Sort");
    printf("\n5. Quick Sort");

    printf("\nEnter choice: ");
    scanf("%d",&choice);

    switch(choice) {
        case 1: bubbleSort(arr,n); break;
        case 2: selectionSort(arr,n); break;
        case 3: insertionSort(arr,n); break;
        case 4: mergeSort(arr,0,n-1); break;
        case 5: quickSort(arr,0,n-1); break;
        default: printf("Invalid Choice");
    }

    printf("\nSorted Array:\n");
    display(arr,n);

    return 0;
}