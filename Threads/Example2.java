package Threads;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Operation-1 is started");
		for(int i=0; i<=5; i++) {
			try {
			System.out.println("operation-1 is executing");
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("operation-1 is completed");
		System.out.println("operation-2 is started");
		for(int i=0; i<=5; i++) {
			try {
			System.out.println("operation-2 is executing");
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("operation-2 is completed");
		System.out.println("operation-3 is started");
		for(int i=0; i<=5; i++) {
			try {
			System.out.println("operation-3 is executing");
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("operation-3 is completed");
		
	}

}
 // As seen in the above program after every single execution the thread is 
//paused for 3 seconds. Within this 3 seconds another thread could have been executed
//and another task would stared/completed

//In order to overcome this problem we have to switch towards multithread programming
