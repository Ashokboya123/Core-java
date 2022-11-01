package PolymarphismExample;

import java.util.Scanner;

public class ShopingCard {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your email id");
		String email_id = sc.nextLine();
		String s1 = "mobile";
		System.out.println(1+"mobile");
		String s2 = "Electronics";
		System.out.println(2+ "Electronics");
		String s3 ="bike";
		System.out.println(3+ "bike");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();
		System.out.println("slect item");
		String names = sc.next();
		switch(ch)
		{
		case 1:
			System.out.println("iphone");
			System.out.println("samsung");
			System.out.println("oppo");
			System.out.println("vivo");
			System.out.println("redmi");
			System.out.println("1+mobile");
			break;
		case 2:
			System.out.println("non-stick items");
			System.out.println("mixers");
			System.out.println("refregireters");
			System.out.println("grinders");
			break;
		case 3:
			System.out.println("KTM BIKE");
			System.out.println("Honda");
			System.out.println("R15");
			System.out.println("pulser");
			System.out.println("Hero honda");
			break;
		default:System.out.println("Thank you for visiting and your "
				+ "item will be deliver soon");
		break;
			
			
		}
		
	}

}
