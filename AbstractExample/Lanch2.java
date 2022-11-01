package AbstractExample;
abstract class Animals{
	abstract void walk();
	abstract void eat();
	void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Tiger extends Animals{

	@Override
	void walk() {
		System.out.println("Tiger walks");
	}

	@Override
	void eat() {
		System.out.println("Tiger eates heat.....");
		
	}
	
}
class Dog extends Animals{

	@Override
	void walk() {
		System.out.println("Dog walks");
		
	}

	@Override
	void eat() {
		System.out.println("dog eats pet food....");
		
	}
	
	
}
class Horse extends Animals{

	@Override
	void walk() {
		System.out.println("Horse walks");
		
	}

	@Override
	void eat() {
		System.out.println("Horse eats grass.....");
		
	}
	
}
class forest{
	void permit(Animals a) {
		a.walk();
		a.eat();
		a.sleep();
	}
}
public class Lanch2 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Dog d = new Dog();
		Horse h = new Horse();
		
		Animals aa = new Animals() {

			@Override
			void walk() {
				// -------
				
			}

			@Override
			void eat() {
				//------
				
			}
			
		};
		forest f = new forest();
		System.out.println("-------Tiger---------");
		f.permit(t);
		
		System.out.println("--------Dog-------");
		f.permit(d);
		
		System.out.println("-------Horse------");
		f.permit(h);
		
		
		
	}

}
