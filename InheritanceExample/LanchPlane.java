package InheritanceExample;
/*Types of methods in inordinateness:
 * 1)Inherited method:
 *    Methods that are taken from the parent class and used as it is in the child class
 *    is called inherited 
 *  2) Overridden Methods: Methods that are taken from the parent class and modify as per the requirement
 *    in the child class is called as Overridden Methods
 *  3) Specialized methods:Methods that are not taken from the parent class and are present as unique
 *     methods in the child class is called as  Specialized methods 
 * 
 */
class Plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane flys");
	}
	void land() {
		System.out.println("plane landed");
	}
}
class Fighterplane extends Plane{
	//@override //indicates that the below method is an override method from the parent class
	void fly() {
		System.out.println("Fighterplanes flys at very hights");
	}
	//specialized method
	void carryweapons(){
		System.out.println("Fighterplanes carry weapons");
	}
}
class cargoPlane extends Plane{
	//@override //indicates that the below method is an override method from the parent class
		void fly() {
			System.out.println("cargoplane flys at very low  hights");
		}
		//specialized methods
		void cargoplane() {
			System.out.println("cargoplane carry goods");
		}
		public void carryweapons() {
			System.out.println("cargoplane carry goods");
			
		}
}

public class LanchPlane {
	public static void main(String[] args) {
		Fighterplane fp = new Fighterplane();
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryweapons();
		cargoPlane cp = new cargoPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryweapons();
		
	}

}
