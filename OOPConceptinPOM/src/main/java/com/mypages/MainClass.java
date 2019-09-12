package com.mypages;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		
//		String a="Dhanush";
//		String c="                 Raju Krish              ";
//		char b=a.charAt(4);
//		System.out.println(b);
//		
//		System.out.println(a.codePointAt(4));
//		System.out.println(a.codePointBefore(4));
//		System.out.println(a.codePointCount(3, 4));
//		System.out.println(a.concat(" Krish"));
//		System.out.println(a.equals("Dhanush"));
//		System.out.println(a.equalsIgnoreCase("DhaNush"));
//		System.out.println(a.compareTo("Dhanusa"));
//		System.out.println(a.compareToIgnoreCase("DhanusA"));
//		System.out.println(a.contains("Dhanusa"));
//		System.out.println(a.contentEquals("Dhanush"));
//		System.out.println(a.endsWith("h"));
//		System.out.println(a.hashCode());
//		System.out.println(a.substring(1));
//		System.out.println(a.substring(0, 3));
//		System.out.println(a.length());
//		System.out.println(a.replace("ush", "am"));
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
//		System.out.println(c.trim());
//		System.out.println(a.indexOf("h"));
//		System.out.println(a.lastIndexOf("h"));
		
		
		int x[]= {4,5,5,5,4,6,6,9,4};
		
		int a=0;
		ArrayList<Integer> x1=new ArrayList<Integer>();
		
		for(int i=0; i<x.length;i++) {
			System.out.println(x[i]);
			if(!x1.equals(x[i])) {
				x1.add(x[i]);
				a++;
				
			}	
			System.out.println(x1.get(i));
		}
		
		
		
		
	}

}
