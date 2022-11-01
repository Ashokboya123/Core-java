package com.gqt.collections;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
	//	al.clear();//This clear all the contents inside the ArrayList
	//	System.out.println(al);
		ArrayList al1 =(ArrayList)al.clone();//create a copy of the existing ArrayList
        System.out.println(al1);
        
       boolean res = al.contains(10);//it will check if the passed data is present in the list or not
       System.out.println(res);
       boolean res1 = al.contains(100);
       System.out.println(res1);
       
     boolean res3 =  al.containsAll(al1);//it will check if the passed data is present in the list or not
     System.out.println(res3);
     al1.add(100);
     System.out.println(al1);
     boolean res4 =  al.containsAll(al1);
     System.out.println(res4);
}
}
