package org.web;

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("enter the ststement:");
		String s=A.nextLine();
		String v=s.replaceAll("Adyar", "omr");
		System.out.println(v);
		A.close();

	}

}
