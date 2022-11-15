package com;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "eeddee";
		
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("not a palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("palindrome");

	}

}
