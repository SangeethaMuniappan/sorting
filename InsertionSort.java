//package day05.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		System.out.println("Enter the array elements :");
		int arr[]=new int[n];
		for(int x=0;x<n;x++) {
			arr[x]=sc.nextInt();
		}
		System.out.println("\nArray before sorting :");
		System.out.println("\n"+Arrays.toString(arr)+" ");
		
		System.out.println("\nStep by Step process of Insertion sorting : ");
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("\n"+Arrays.toString(arr)+" ");
        }
        System.out.println("\nArray After Sorting :");
        System.out.println("\n"+Arrays.toString(arr)+" ");
		
		

        
	}

}
