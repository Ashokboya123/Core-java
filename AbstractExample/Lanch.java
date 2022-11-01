package AbstractExample;
abstract class Plane
{
	abstract void takeOff();
	abstract void fly();
	void land()
	{
		System.out.println("plane landed");
	}
}
class CargoPlane extends Plane
{
	@Override
	void takeOff()
	{
		System.out.println("CargoPlane took off");
	}

	@Override
	void fly() {
		System.out.println("Cargo plane fly at lower heights");
		
	}
	void carryGoods() {
		System.out.println("cargoplane carry goods");
	}
	
}
class passengersPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("passenger plane took off");
		
	}

	@Override
	void fly() {
		System.out.println("passenger plane fly at heights");
		
	}
	void carryPassengers() {
		System.out.println("passengers plane carry passengers");
	}
	
}
class FighterPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("fighter plane took off");
		
	}

	@Override
	void fly() {
		System.out.println("fighter plane fly at greater heights");
		
	}
	void carrryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
	
}
class AirPort{
	 void permit(Plane p) {
		 p.takeOff();//from the parent class
		 p.fly();//from the child class
		 p.land();//from the parent class
	
	}
}

public class Lanch {
	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		passengersPlane pp  = new passengersPlane();
		FighterPlane f = new FighterPlane();
		
	//	plane p = new plane();//error cannot create object of abstract class
		Plane p = new Plane() {

			@Override
			void takeOff() {
				// ----
				
			}

			@Override
			void fly() {
				// ----
				
			}
			
		};
		AirPort a = new AirPort();
		System.out.println("----------cargoplane-----------");
		a.permit(c);
		c.carryGoods();// from the child class
		
		System.out.println("---------passenger plane---------");
		a.permit(pp);
		pp.carryPassengers();//from the child class
		
		System.out.println("--------Fighter plane---------");
		a.permit(f);
		f.carrryWeapons();//from the child class
	}

}
