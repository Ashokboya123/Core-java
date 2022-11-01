package InheritanceExample;
class Animal{
	void eat() {
		System.out.println("Animal eates");
	}
	void sleep() {
		System.out.println("Animal slepps");
	}
	void breath() {
		System.out.println("animal breaths");
	}
}
class Elephant extends Animal{
	@Override
	void eat() {
		System.out.println("elephant eates grains and vegetables");
	}
}
class Monkey extends Animal{
	@Override
	void eat() {
		System.out.println("monkey eates fruites");
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("tiger eates meat");
	}
}
	

	


public class COde4{
	public static void main(String[] args) {
		Elephant e = new Elephant();
		Monkey m = new Monkey();
		Tiger t = new Tiger();
		
		e.eat();//child
		e.sleep();//parent
		e.breath();//parent
		
		m.eat();//child
		e.sleep();//parent
		e.breath();//parent
		
		t.eat();//child
		t.sleep();//parent
		t.breath();//parent
		
		
	}

}
