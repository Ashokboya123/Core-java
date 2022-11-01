package InterfaceEaxmple;
interface Plane{
	default void takeoff() {
		System.out.println("plane takes off");
	}
	void fly();
	default void land() {
		System.out.println("plane lands");
	}
}
class CargoPlane implements Plane{
	public void fly() {
		System.out.println("cargo plane flies");
	}
}
class PassengerPlane implements Plane{
	public void fly() {
		System.out.println("passsenger plane flies");
	}
}
class FighterPlane implements Plane{
	public void fly() {
		System.out.println("Fighter plane flies");
	}
}

public class Code {

	public static void main(String[] args) {
		Plane p;
		CargoPlane cp = new CargoPlane();
		p=cp;
		p.takeoff();
		p.fly();
		p.land();
		
		PassengerPlane pp = new PassengerPlane();
		p=pp;
		p.fly();
		p.takeoff();
		p.land();
		
		FighterPlane fp =new FighterPlane();
		p=fp;
		p.takeoff();
		p.fly();
		p.land();

	}

}
