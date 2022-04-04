package org.web;

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Input:");
		String a=S.next();
		String e=a.replaceAll("[AaEeIiOoUu]", "@");
	     System.out.println("output:"+e);
			S.close();
	}

}
