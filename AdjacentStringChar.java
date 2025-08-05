package com;

import java.util.Scanner;

public class AdjacentStringChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.next();
		System.out.println(rearrange(input));
		
	}
	 public static String rearrange(String str) {
	int[] freq = new int[26];
    int length = str.length();
    
    for (int i = 0; i < length; i++) {
        freq[str.charAt(i) - 'a']++;
    }

    char[] result = new char[length];
    char lastChar = 0;

    for (int pos = 0; pos < length; pos++) {
        int maxFreq = 0;
        int selectedIndex = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq && (char)(i + 'a') != lastChar) {
                maxFreq = freq[i];
                selectedIndex = i;
            }
        }

        if (selectedIndex == -1) {
            return "Not Possible";
        }

        result[pos] = (char)(selectedIndex + 'a');
        freq[selectedIndex]--;
        lastChar = result[pos];
    }

    return new String(result);
}
}
