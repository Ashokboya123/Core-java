package ExceptionHandling;
//Finalize method:
//--> Garbage collection is the process of handling all the object which is treated as garbage
//-->An object is treated as a garbage provided it is not having any handle or if it is de-referenced
//--> On the heap segment the garbage collector will keep scanning for handling the garbage
///--> We can invoke the garbage collector using System.gc();
//--> Finalize is used for the cleaning up the object during  garbage collection
//--> It is automatically invoked when the object is garbage collected
class Calcy{
	void add() {
		System.out.println("add method");
	}
	protected void finalize() {
		System.out.println("Finalize method is invoked for calcy");
	}
}

public class FinalizeExample {
	public static void main(String[] args) {
		FinalizeExample c = new FinalizeExample();
		System.out.println("Address of FinalizeExample object is:"+c);
		c=null;
		System.gc();
		
		Calcy c1 = new Calcy();
		c1.add();
		c1=null;
		System.gc();
		
		System.out.println("garbage collection is completed");
	}
	protected void finalize() {
		System.out.println("Finalize method is invoked for FinalizeExample");
	}

}
