package ExceptionHandling;

import java.util.Scanner;

//Finally block:
//--> It is always used with try and catch blocks
//--> It is used in such scenarios where a particular set of statements must be executed
//--> Irrespective of what exception got generated
public class FinallyBlock {
	public static void main(String[] args) {
		try {
		System.out.println("Enter the program-3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int numerator =sc.nextInt();
		System.out.println("enter the denominator:");
		int de = sc.nextInt();
		int res = numerator/de;//critical statement:ArithmeticException
		System.out.println(res);
		
		System.out.println("enter the arry size:");
		int size = sc.nextInt();
		int arr[]= new int[size];//critical statement:NegativeArraySizeException
		System.out.println("Enter the postion to insert the data:");
		int pos = sc.nextInt();
		System.out.println("enter the data:");
		int data = sc.nextInt();
		
		arr[pos]=data;//critical statement:ArrayIndexOutOfBound
		System.out.println("data inserted");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in code-3");
		}
		finally {
			System.out.println("Exiting program-3");
		}
	}
	

}
