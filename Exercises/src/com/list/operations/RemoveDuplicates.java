package com.list.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*Questionaire Exercise*/
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		Duplicates();
	}
	
	public static void Duplicates()
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,6,7,8,8));
		
		/*Approach 1
		 * https://codereview.stackexchange.com/questions/64011/removing-elements-on-a-list-while-iterating-through-it
		 * This is a simple solution for the underlying problem of your first code: A ConcurrentModificationException 
		 * is thrown because you iterate through the list and removing from it at the same time.
		 * So Approach 3 is correct. Approach 1 throws ConcurrentModificationException.
		 * 
		 * Down-sides of this approach:
			1. Creates a copy of the original list, which requires memory and an operation which performance depends on 
			the type of the list (ArrayList, LinkedList, etc.)
			2. Additionally, nums.remove(value) is a O(n)O(n) operation. Making this loop overall O(n2)*/
		/*for(Integer element : list)
		{
			if(element%2 == 0)
				list.remove(element);
		}*/
		
		/*Approach 2
		 * Even this approach is also not thread-safe. It can throw */
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			Integer element = iterator.next();
			  if(element%2 == 0)
				//iterator.remove(element); 
				  /*This was in question, but it should not take overload element.
				   * Below is the working code.*/
				  iterator.remove();
		}
		
		
		/*Approach 3*/
		List<Integer> tempList = new ArrayList<Integer>();
		for(Integer element : list)
		{
			if(element%2 == 0)
				tempList.add(element);
		}
		
		list.removeAll(tempList);
		
		
		/*Approach 4*/
		List<Integer> filteredList = list.stream().filter(x->x%2 != 0).collect(Collectors.toList());
		
	}	 	
}
