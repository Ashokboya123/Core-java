package ExceptionHandling;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :1");
		int num1 = sc.nextInt();
		System.out.println("Enter number:2");
		int num2 = sc.nextInt();
		
		int res = num1/num2; // Critical statement
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("---------Exception is generated------");
		}
	}

}
