package com;

public class SubArraySum {
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 7, 5};
        findSubarray(arr, 12);
    }
	 public static void findSubarray(int[] arr, int sum) {
	        int start = 0, currSum = 0;
	        for (int end = 0; end < arr.length; end++) {
	            currSum += arr[end];
	            while (currSum > sum) {
	                currSum -= arr[start++];
	            }
	            if (currSum == sum) {
	                System.out.print("Subarray: ");
	                for (int i = start; i <= end; i++)
	                    System.out.print(arr[i] + " ");
	                return;
	            }
	        }
	        System.out.println("No subarray found");
	    }
}
