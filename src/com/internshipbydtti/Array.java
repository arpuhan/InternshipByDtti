package com.internshipbydtti;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		System.out.println("Enter string numbers :");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		
		}
		/*Minimum of an Array
		int x=arr[0];
		for(int i=0;i<4;i++) {
			if(x>=arr[i]) {
				x=arr[i];
			}
		
		}
		System.out.println("Minimum Value is :"+x);
		Maximum From an Array
		int x=arr[0];
		for(int i=0;i<4;i++) {
			if(x<=arr[i]) {
				x=arr[i];
			}
		
		}
		System.out.println("Maximum Value is :"+x);
		Array addition
		 int sum=0;
		for(int i=0;i<4;i++) {
			sum=sum+arr[i];
		}
		int avg = sum/arr.length;
		if(avg >= 75)
			System.out.print("A grade");
		else if(avg >=60 && avg<75)
			System.out.print("B grade");
		else if(avg >=45 && avg<60)
			System.out.print("C grade");
		else
			System.out.print("D grade");
		Sorting an array 
		 Arrays.sort(arr);
		System.out.print("Sorted array is :");
		for(int i=0;i<4;i++) {
			
			System.out.print(arr[i]+" ");
		}
		 */
	}

}
