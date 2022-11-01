package Threads;

import java.util.Scanner;

// Multi threaded programming:
//--> Executing multiple tasks simultaneously using multiple thread is called as multithreading
//--> We can achieve multi threading using two approaches:
 //     1.using Thread class
 //     2. using Runnable InterFace
class Operation extends Thread{ // class operation is-a Thread
	public void run() {
		if(Thread.currentThread().getName().equals("operation1")) {
			operation1();
		}
		else if(Thread.currentThread().getName().equals("operation2")) {
			operation2();
		}
		else {
			operation3();
		}
	}
    Scanner sc = new Scanner(System.in);
    void operation1() {
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
		
	}
    void operation2() {
		System.out.println("Operation-2 is started");
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
		
	}

	
	 void operation3() {
		System.out.println("Operation-3 is started");
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

public class MultiThreadExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread is started");
		Operation o1 = new Operation();
		Operation o2 = new Operation();
		Operation o3 = new Operation();
		// Since operation class is not behaving like Thread we must crate a separate Thread
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		Thread t3 = new Thread(o3);
		
		t1.setName("opatration-1");
		t2.setName("opatration-2");
		t3.setName("opatration-3");
		
		t1.start();// assigning the o1 thread to thread schedular
		t1.join();
		t2.start();// assigning the o2 thread to thread schedular
		t2.join();
		t3.start();// assigning the o3 thread to thread schedular
		t3.join();
		System.out.println("main method Terminated");
		
	}

}
//In this program we will achieve multi threaded programming
// in this program we will also notice that the main thread will terminate first
// while other threads are yet to be executed
