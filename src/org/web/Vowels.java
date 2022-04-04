package org.web;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word:");
		String a=s.nextLine();
		
		int p=a.length();
		int count=0;
		for(int i=0;i<p;i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				count=count+1;
			}
				}
		System.out.println("vowels in the given string:"+count);
		s.close();
	}

}
