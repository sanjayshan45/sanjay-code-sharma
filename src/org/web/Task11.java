package org.web;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter password");
		String a = s.next();
		System.out.println("confirm password");
		String w = s.next();

		
		  if(a.equals(w)) { System.out.println("the given password is equal"); }else {
		  System.out.println("not equal"); }
		 
		s.close();
	}

}
