package InheritanceExample;
class Animal
{
	String name;
	int age;
	String country;
	String color;
	
	 Animal(String name,int age,String country,String color)
	{
		super();
		this.name=name;
		this.age=age;
		this.country=country;
		this.color=color;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
	}
	 //If the programmer has written a constructor inside the class then 
	 //the complier will not place a default constructor
}
class Tiger extends Animal
{

	Tiger() 
	{
		super("Laxman",5 ,"Africa", "orange");
		
		name="ramu";
		age=10;
		country="India";
		color="whitw";
		
	}
	void getData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
	}
	
}
public class Code2 {
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.getData();
	}

}
