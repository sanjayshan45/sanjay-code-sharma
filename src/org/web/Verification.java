package org.web;

import java.util.Scanner;

public class Verification {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("Enter the mail ID:");
		String a=A.nextLine();
		boolean b=a.contains("@");
		System.out.println("valid email ID:"+b);
		A.close();
		

	}

}
