package PolymarphismExample;
class OS{
	private String name;
	private float version;
	public OS(String name, float version) {
		super();
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public float getVersion() {
		return version;
	}
	
}
class Charger{
	private String company;
	private int volts;
	public Charger(String company, int volts) {
		super();
		this.company = company;
		this.volts = volts;
	}
	public String getCompany() {
		return company;
	}
	public int getVolts() {
		return volts;
	}
	
}
class Mobile{
	OS os = new OS("android",12.0f);
	void hasA(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}
public class Program1 {
	public static void main(String[] args) {
		Charger c = new Charger("Samsung",5);
		Mobile m = new Mobile();
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		m.hasA(c);
		
		m=null;
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());

		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		
	}

}
