package Sorting;

import java.util.Scanner;

public class InsertionSort {
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

        // Logic
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        // Logic ends
        System.out.println();
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

// Time complexity --> O(n^2)
