package ExceptionHandling;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

class Sample_code1{
	void method_1()
	       throws ArithmeticException,ArrayIndexOutOfBoundsException,NegativeArraySizeException,Exception
	
	{
		System.out.println("Method-1 Started ");
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
		System.out.println("Method-1 Terminated");
		}
		
	}
class Sample_code_2{
	void Method_2()
			 throws ArithmeticException,ArrayIndexOutOfBoundsException,NegativeArraySizeException,Exception
				    
	{
		System.out.println("Method-2 Started");
		Sample_code1 sc1 = new Sample_code1();
		sc1.method_1();//take the control to line:3
		System.out.println("Method-2 Terminated");
		
	}
}
class Sample_code_3{
	void Method_3()
			 throws ArithmeticException,ArrayIndexOutOfBoundsException,NegativeArraySizeException,Exception
				    
	{
		System.out.println("Method-3 Started");
		Sample_code_2 sc2 = new Sample_code_2();
		sc2.Method_2();//take the control to line:33
		System.out.println("Method-3 Terminated");
		
}



public class Code1 {
	public static void main(String[] args) {
		try {
			System.out.println("Method main started");
			Sample_code_3 sc3 = new Sample_code_3();
			sc3.Method_3();//take control to line:43
			System.out.println("Method main terminated");
			
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
}



