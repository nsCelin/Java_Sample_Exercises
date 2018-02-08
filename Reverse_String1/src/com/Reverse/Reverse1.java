package com.Reverse;

public class Reverse1 {

	public static void main(String[] args) {
		System.out.println(Reverse("Pizza"));
	}
	
	public static String Reverse (String input)
	{
		String temp = new StringBuilder(input).reverse().toString();
		return temp;
	}

}
