package Threads;

 

class Bathroom extends Thread
{
     public void run() {
    	 try {
         System.out.println(Thread.currentThread().getName()+"enter the bathroom");
    	 Thread.sleep(3000);
    	 System.out.println(Thread.currentThread().getName()+"using the bathroom");
    	 Thread.sleep(3000);
    	 System.out.println(Thread.currentThread().getName()+"left the bathroom");
    	 Thread.sleep(3000);
    	 }
    	 catch(InterruptedException e) {
    		 e.printStackTrace();
    	 }
    	 
    	 }
     }


public class Lanch {
	public static void main(String[] args) {
		Bathroom b1 = new Bathroom();
		Bathroom b2 = new Bathroom();
        Bathroom b3 = new Bathroom();
        
        b1.setName("Boy ");
        b2.setName("Girl ");
        b3.setName("Others ");
        
        b1.start();
        b2.start();
        b3.start();
	}

}
