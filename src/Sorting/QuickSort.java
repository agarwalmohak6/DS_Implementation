package Sorting;

import java.util.Scanner;

public class QuickSort {
    int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println("Unsorted array is");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        QuickSort m1 = new QuickSort();
        m1.quick(a, 0, n - 1);
        System.out.println();
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
