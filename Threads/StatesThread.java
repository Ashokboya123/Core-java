package Threads;
class Cricketer extends Thread
{
	String res1 = "ODI World cup";
	String res2 = "Champions Trophy";
	String res3 = "Tset Wrold cup";
	
	public void run() {
		try {
		if(Thread.currentThread().getName().equals("Rohith")) {
			RohithAcq();
		}
		else
		{
			BabarAcq();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
   public void RohithAcq() throws InterruptedException {
	   synchronized (res1) { //locking rse1 : it makes the rse1 unavailable for other Threads
		System.out.println(Thread.currentThread().getName()+" has won the "+res1);
		Thread.sleep(4000);
		
	}
		synchronized (res2) { //locking rse2
			System.out.println(Thread.currentThread().getName()+" has won the"+res2);
			Thread.sleep(4000);
			synchronized (res3) { //locking rse3
				System.out.println(Thread.currentThread().getName()+" has won the"+res3);
				Thread.sleep(4000);
			}//lock o is released res3
		}//lock o is released res2
		
	}//lock o is released res1
	public void BabarAcq() throws InterruptedException {
		 synchronized (res1) { //locking rse1 : it makes the rse1 unavailable for other Threads
				System.out.println(Thread.currentThread().getName()+" has won the "+res1);
				Thread.sleep(4000);
				
			}
				synchronized (res2) { //locking rse2
					System.out.println(Thread.currentThread().getName()+" has won the"+res2);
					Thread.sleep(4000);
					synchronized (res3) { //locking rse3
						System.out.println(Thread.currentThread().getName()+" has won the"+res3);
						Thread.sleep(4000);
					}//lock o is released res3
				}//lock o is released res2
				
			}//lock o is released res1
		
		
		
}

public class StatesThread {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer();
		c1.setName("Rohith");
		c2.setName("Babar");
		
		c1.start();
		c2.start();
	}

}
