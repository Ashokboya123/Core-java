package com.gqt.collections;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(100);
		al.add(1000);
		al.add(10000);
		System.out.println(al);
		//overcome the first disadvantage of Arrays
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add('h');
		al1.add(40.5);
		al1.add("Ashok");
		al1.add('@');
		System.out.println(al1);
		//overcome the second disadvantage of Arrays
		al1.add(500);
		System.out.println(al1);
		
	}

}
