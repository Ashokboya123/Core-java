package Threads;
// A Thread group is collection of multiple Threads sometimes it can
//  even contain another Thread group also.
class ThreadGropExmp implements Runnable{

	@Override
	public void run() {
		System.out.println(" The Thread that is executing is :"+Thread.currentThread().getName());
		
	}
	
}
public class ThreadGroups {
	public static void main(String[] args) {
		ThreadGropExmp tgx = new ThreadGropExmp();
		ThreadGroup tg = new ThreadGroup("Exmple");
				
		Thread t1 = new Thread(tg,tgx,"Thread-1");
		Thread t2 = new Thread(tg,tgx,"Thread-2");
		Thread t3 = new Thread(tg,tgx,"Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		tg.list();
	}

}
 