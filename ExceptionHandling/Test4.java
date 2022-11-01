package ExceptionHandling;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class Test4 {
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
	catch(ArithmeticException e) {
		System.out.println("-----Arithmetc Exception is generated-------");
	}
	catch(NegativeArraySizeException e) {
		System.out.println("------NegativeArraySizeException is generated----");
	}
	catch(AlreadyBoundException e) {
		System.out.println("------ArrayIndexOutOfBoundException is generated----");
	}
	catch(Exception e)
	{
		System.out.println("---------Exception is generated------");
	}
}

}
