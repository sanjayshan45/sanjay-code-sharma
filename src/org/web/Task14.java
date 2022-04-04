package org.web;

public class Task14 {

	public static void main(String[] args) {

		StringBuffer d = new StringBuffer("my name is preethi");
		StringBuffer a = d.reverse();
		System.out.println(a);
		a.insert(2, " ");
        a.insert(7, " ");
        a.deleteCharAt(9);
        a.deleteCharAt(11);
        a.deleteCharAt(15);
        StringBuffer as = a.insert(10, " ");
        System.out.println(as);

	}

}
