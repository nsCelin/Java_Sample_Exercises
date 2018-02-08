package com.Reverse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_Lambda {

	public static void main(String[] args) {
		System.out.println(Reverse(new String[] {"Pizza","Chocolate"}));
	}
	
	public static List<String> Reverse (String[] input)
	{
		/*stream().map() lets you convert an object to something else. 
		 * MYU : it is similar to that of Select*/
		List<String> temp = Arrays.asList(input).stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
		return temp;
	}
}
