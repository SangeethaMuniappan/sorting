//package week05.day04.p3;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int temp = 0;  
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int length=scanner.nextInt();
		System.out.println("Enter the array elements :");
		int arr[]=new int[length];
		for(i=0;i<length;i++) {
			arr[i]=scanner.nextInt();
		}
		for(i=0;i<length;i++) {
			for(j=1;j<length;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					System.out.println(Arrays.toString(arr));
					
					
				}
			}
		}
		

	}

}
