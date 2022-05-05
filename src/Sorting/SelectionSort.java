package Sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Unsorted array is");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        //Logic
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest])
                    smallest=j;
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        // Logic Ends

        System.out.println();
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

// Time complexity --> O(n^2)