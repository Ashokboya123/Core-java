package Threads;



//Race condition:
//It is  a scenario where multiple threads will fight against each other to acquire
//CPU time: the chance to perform the operation
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

	public void autosave()throws InterruptedException {
		for(int i=0; i<=5; i++) {
			System.out.println("Typing....");
			Thread.sleep(3000);
		}
	}

	public void spellcheck()throws InterruptedException {
		for(int i=0; i<=5; i++) {
			System.out.println("spell cheking....");
			Thread.sleep(3000);
		}
	}

	public void typing()throws InterruptedException {
		for(int i=0; i<=5; i++) {
			System.out.println("Auto saving....");
			Thread.sleep(3000);
		}
	}
}

public class LanchMsOffice {
	public static void main(String[] args) {
		MsOffice ms1 = new MsOffice();
		MsOffice ms2 = new MsOffice();
		MsOffice ms3 = new MsOffice();
		
		ms1.setName("Typing");
		ms2.setName("spellcheck");
		ms3.setName("autosave");
		
		ms1.start();
		ms2.start();
		ms3.start();
		
	}

}
