package ExceptionHandling;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println("Division operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :1");
		int num1 = sc.nextInt();
		System.out.println("Enter number:2");
		int num2 = sc.nextInt();
		
		int res = num1/num2; // Critical statement
		System.out.println(res);
		System.out.println("Array operation");
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value to be add:");
		int val = sc.nextInt();
		System.out.println("Enter the postion to which the value must be added:");
		int pos = sc.nextInt();
		
		arr[pos]= val;
		
		System.out.println("value added");
		}
		catch(Exception e)
		{
			System.out.println("---------Exception is generated------");
		}
	}


}
/* The problem with single catch block is that we will not be able to
 * identify which exception got generated as it will give a
 * same generic message for each exception that is generated
 */
