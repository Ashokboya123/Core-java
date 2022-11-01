package Threads;




class Produsers extends Thread{
	Queues a;
	public Produsers(Queues q) {
		a=q;
	}
	public Produsers() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
		}
	}
}
class Queues{
	int x;

	public void get() {
	System.out.println(" I have fetched the value"+x+"from x.");
		
	}

	public void put(int i) {
		x=i;
		System.out.println(" I have added the value"+i+"into x.");
		
	}
	
}
class Consumers{
	Queues b;
	public Consumers(Queues q) {
		b=q;
	}
	public void run() {
		while(true) {
			b.get();
		}
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
}

public class ProdusersCounsumers {
	public static void main(String[] args) {
		Produsers p = new Produsers();
		Queues q = new Queues();
		Consumers c = new Consumers(q);
		
		p.start();
		c.start();
	}

}
