package com;

import java.util.Arrays;

public class MissingNumberInAP {
	
	public static void main(String[] args) {
        int[] arr = {2, 6, 10, 14, 18};
        Arrays.sort(arr);
        int diff = (arr[arr.length - 1] - arr[0]) / arr.length;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                System.out.println("Missing: " + (arr[i - 1] + diff));
                break;
            }
        }
    }

}
