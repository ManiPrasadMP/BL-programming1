package com;

import java.util.Scanner;

public class SecondMaximum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the array  Elements : ");
		for(int i = 0;i<n;i++)
			numbers[i] = sc.nextInt();
		
		int first_max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		
		for(int i = 0;i<n;i++) {
			if(numbers[i]>first_max) {
				second_max = first_max;
				first_max = numbers[i];
			}
			if(numbers[i]>second_max && numbers[i]<first_max)
				second_max = numbers[i];
		}
		
		System.out.println("Second maximum number in array : "+second_max);
	}
}
