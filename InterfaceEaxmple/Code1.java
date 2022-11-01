package InterfaceEaxmple;
interface Calcultator{
	int a =10;
	void add();
	public default void sub() {
		
	}
	static void div() {
		
	}
}
class Calcy1 implements Calcultator{
	public void add() {

	}
}
class Calcy2 implements Calcultator{
	public void add() {
		
	}
}
class Calcy implements Calcultator {
	public void add() {
		
	}
}

public class Code1 {
	public static void main(String[] args) {
		Calcultator c = new Calcultator(); // error
		
		//anonymous inner types
		Calcultator c1 = new Calcultator() {

			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
			
		};
		Calcultator c2;
	}

}
