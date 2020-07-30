package com.app;

import java.util.Scanner;

public class StringIntegerPalindrome {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		String str =null;
		String rev="";

		Integer n=null;
		Integer temp=n;
		int reminder,revr = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number or string:");

		str= sc.next();

		if(str==str) {

			int length=str.length();
			for(int i=length-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev)) 
				System.out.println("It is palindrome");
			else
				System.out.println("It is not palindrome");
		}
		else
		{
			while(n!=0) {
				reminder=n%10;	//5%10=0.5
				revr=revr*10+reminder;	//0*10+0.5
				n=n/10;		// 5/10=0.5
			}
			if(temp==revr) {
				System.out.println("It is a palindrome");
			}
			else {
				System.out.println("It is not a palindrome");
			}
		}
	}
}
