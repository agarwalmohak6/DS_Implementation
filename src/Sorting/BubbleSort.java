package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.println("Unsorted array is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        // Logic
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // Logic Ends

        System.out.println();
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

// Time complexity --> O(n^2)