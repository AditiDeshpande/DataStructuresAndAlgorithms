// Java program to find minimum difference between 
// any pair in an unsorted array 

import java.util.Arrays; 

public class MinDiff 
{ 
	// Returns minimum difference between any pair 
	static int findMinDiff(int[] arr, int n) 
	{ 
		// Sort array in ascending order 
		Arrays.sort(arr); 
		
		// Initialize difference as infinite 
		int diff = Integer.MAX_VALUE; 
		
		// Find the min diff by comparing adjacent 
		// pairs in sorted array 
		for (int i=0; i<n-1; i++) 
			if (arr[i+1] - arr[i] < diff) 
				diff = arr[i+1] - arr[i]; 
		
		// Return min diff 
		return diff; 
	} 


	public static void main(String[] args) 
	{ 
		int arr[] = new int[]{1, 55, 33, 19, 98, 25}; 
		System.out.println("Minimum difference is "+ 
							findMinDiff(arr, arr.length)); 
	
	} 
} 


/*

Diff. between 19 and 25 is 6 and that is the min. diff of all the array elements
Output

Minimum difference is 6

*/

