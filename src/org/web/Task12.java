package org.web;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	String a = s.next();
		if(a.contains("pincode")) {
			String ss = a.replaceAll("pincode","  ");
			System.out.println(ss);
		}
		s.close();

	

	}

}
