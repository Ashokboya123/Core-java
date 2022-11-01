package Threads;

public class ThreadExample1 {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("Ashok");
		t.setPriority(8);
		System.out.println(t);
	}
	

}
