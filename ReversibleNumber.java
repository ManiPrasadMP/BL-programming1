package com;

import java.util.Scanner;

public class ReversibleNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(""+num1);
//		int reverse = Integer.parseInt(sb.reverse().toString());
		int reverse = 0;
		int temp = num1;
		do {
			int dig = temp%10;
			reverse = reverse*10+dig;
			temp = temp/10;
		}while(temp!=0);
		System.out.println(reverse);
		int addnum = num1+reverse;
		boolean isrev = true;
		while(addnum!=0) {
			int dig = addnum%10;
			if(dig%2!=1) {
				isrev = false;
				break;
			}
			addnum /=10;
		}
		if(isrev) {
			System.out.println(num1+" is reversible number");
		}
		else
			System.out.println(num1+" is not reversible number");
		
	}
}
