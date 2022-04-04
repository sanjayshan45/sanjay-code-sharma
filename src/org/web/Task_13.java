package org.web;

public class Task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="Cricket is my favourite game";
		String B="Cricket";
		String D="cricket";
		String C=" MS DHONI is my idol ";
		
		
		String ss[]=A.split("t");
		for(String dd:ss)
		{
		System.out.println(dd);
		}
		
		int a=A.length();
		System.out.println(a);
		
		int b=C.length();
		System.out.println(b);
		
		boolean c=B.equals(A);
		System.out.println(c);
		
		boolean d=A.equals(C);
		System.out.println(d);
		
		String e=A.toUpperCase();
		System.out.println(e);
		
		String f=C.toLowerCase();
		System.out.println(f);
		
		boolean g=A.contains("favourite");
		System.out.println(g);
		
		boolean h=B.contains("Idol");
		System.out.println(h);
		
		int i=A.indexOf("f");
		System.out.println(i);
		
		char j=C.charAt(17);
		System.out.println(j);
		
		boolean k=B.isEmpty();
		System.out.println(k);
		
		int l=D.compareTo(B);
		System.out.println(l);
		
		int m=C.lastIndexOf("i");
		System.out.println(m);
		
		String n=C.replace("S","D");
		System.out.println(n);
		
		String o=C.trim();
		System.out.println(o);
		
		String p=C.substring(13,20);
		System.out.println(p);
		
		String q=C.substring(12);
		System.out.println(q);
		
		System.out.println(String.join("s","dd","ddd"));
		
	}

}
