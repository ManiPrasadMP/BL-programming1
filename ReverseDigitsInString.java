package com;

import java.util.Scanner;

public class ReverseDigitsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.next();
		
		int l = 0;
		int r = input.length()-1;
		int s1=-1,s2=-1;
		char[] chr = input.toCharArray();
		while(l<r) {
			if(Character.isDigit(chr[l])) 
				s1 = l;
			
			if(Character.isDigit(chr[r])) 
				s2 = r;
			
			if(s1 !=-1 && s2!=-1) {
				char temp = chr[s1];
				chr[s1] = chr[s2];
				chr[s2] = temp;
				s1 = -1;s2=-1;
			}
				l++;
				r--;
		}
		
		input = new String(chr);
		System.out.println(input);
		
		
	}
}
