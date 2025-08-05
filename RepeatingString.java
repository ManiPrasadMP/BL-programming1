package com;

import java.util.Scanner;

public class RepeatingString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.next();
		
		StringBuilder rs = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			if(rs.indexOf(""+c)==-1)
				rs.append(c);
			else
				break;
		}
		System.out.println(rs);
	}
}
