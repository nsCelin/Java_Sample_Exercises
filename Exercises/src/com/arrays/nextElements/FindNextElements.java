package com.arrays.nextElements;

import java.util.Arrays;


/*
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */

public class FindNextElements {

	public static void main(String[] args) {
        
		//int[] arr = {1,3,5,4,1,2,7}; //Output :6
		//int[] arr = {1,10,8,4,1,2,17}; //Output :3
		//int[] arr = {-1,-3}; 
		//int[] arr = {1,2,3};
		//int[] arr = {-1,-2};
		 int[] arr = {3,-1};
		System.out.println("The next smallest returned number is : " +ReturnElement(arr));
		
	}
	
	//https://stackoverflow.com/questions/1694751/java-array-sort-descending
	public static int ReturnElement(int[] arr)
	{
		int number = 0;		
		Arrays.sort(arr);
		
		for(int i= 0; i< arr.length; i++)
		{			
			if(i == arr.length-1)
			{				
				if(arr[i]<0)
					number = 1;
				else 
					number = arr[i]+1;				
			}
			else
			{
				if(arr[i] == arr[i+1])
				{
					 System.out.println(arr[i]);
				}			
				else if((arr[i+1] - arr[i])==1)
					System.out.println(arr[i]);
				else
				{
					if(arr[i+1]>0 && arr[i]>0)
					   number = arr[i]+1;
					else if(arr[i+1] <0 && arr[i]<0)
						number = 1;
					else if(arr[i]<0 && arr[i+1]>0)
						number = arr[i+1]+1;
					break;
				}
			}							
		}
		return number;
	}

}
