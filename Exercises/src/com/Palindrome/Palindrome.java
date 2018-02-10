package com.Palindrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
	}
	
	public static boolean isPalindrome(String word) {       
        return word.toLowerCase().equals(new StringBuilder(word).reverse().toString().toLowerCase());   
        /*return word.equals(new StringBuilder(word).reverse().toString().toLowerCase());   
          If this is the case, then the comparison between 'Deleveled' and 'deleveled is false as Java is case sensitive'*/
   }

}
