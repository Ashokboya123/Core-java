package Threads;
//solution to Race condition:
// Daemon threads are the solution to the Race condition:
// ---> Identify the primary and secondary thread
// ---> Allocated infinite loop to the secondary thread
// ---> set the primary to the secondary thread grater than 8
// ---< set the setDaemon() as true.

class MsOffice extends Thread
{
	public void run() {
		try {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		}
		else {
			autosave();
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	//point 1:
	// primary operation
	public void autosave()throws InterruptedException {
		for(int i=0; i<=5; i++) {
			System.out.println("Typing....");
			Thread.sleep(3000);
		}
	}
	//point 1:
		// secondary operation

	public void spellcheck()throws InterruptedException {
		for(; ;) { // point 2: Infinite loop
			
			System.out.println("spell cheking....");
			Thread.sleep(3000);
		}
	}
	//point 1:
		// secondary operation

	public void typing()throws InterruptedException {
		for(; ;) { //// point 2: Infinite loop
			System.out.println("Auto saving....");
			Thread.sleep(3000);
		}
	}
}

public class Lanch2 {
	public static void main(String[] args) {
		MsOffice ms1 = new MsOffice();
		MsOffice ms2 = new MsOffice();
		MsOffice ms3 = new MsOffice();
		
		ms1.setName("Typing");
		ms2.setName("spellcheck");
		ms3.setName("autosave");
		
		ms2.setPriority(8);//Point 3: Higher priority
		ms3.setPriority(9);//Point 3: Higher priority
		
		ms2.setDaemon(true);//point 4 : Daemon activation
		ms3.setDaemon(true);//point 4 : Daemon activation
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
