package com.gqt.collections;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.add(2,50);
		System.out.println(al);
		 
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(100);
		al1.add(1000);
		al1.add(10000);
		al.addAll(al1);
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add('h');
		al2.add(40.5);
		al2.add("Ashok");
		al2.add('@');
		al.addAll(1,al2);
		System.out.println(al);

}
}
