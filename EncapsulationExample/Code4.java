package EncapsulationExample;
class Tiger//extends object-- this statement will be given by the complier as the class Tiger is an orphan class
{
	private String name;
	private String color;
	private int age;
	private String country;
	
	//zero parameterized constructor
	public Tiger()
	{
		super();
		name="ramu";
		color="white";
		age=5;
		country="india";
		
	}
	//parameterized constructor
	public Tiger(String name,int age,String color,String country)
	{
		super();
		this.name=name;
		this.color=color;
		this.age=age;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
}

public class Code4 {
	public static void main(String[] args) {
		Tiger t1=new Tiger();//zero parameterized constructor
		Tiger t2=new Tiger("Laxman",5,"orange","southafrica");
		
		System.out.println("Tiger-1");
		System.out.println(t1.getName()+"----"+t1.getColor()+"--"+t1.getAge()+"--"+t1.getCountry());
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		System.out.println("Tiger-2");
		System.out.println(t2.getName()+"----"+t2.getColor()+"--"+t2.getAge()+"--"+t2.getCountry());
		
		
	}

}
