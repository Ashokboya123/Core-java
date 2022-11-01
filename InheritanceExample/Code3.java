package InheritanceExample;
class Animal
{
	String name;
	int age;
	String country;
	String color;
	
	 Animal(String name,int age,String country,String color)
	{
		super();//object class constructor
		this.name=name;
		this.age=age;
		this.country=country;
		this.color=color;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
	}
	 Animal()
	 {
		 this("Laxman",5,"Africa","Orange");//Local chaining
		 name="ramu";
		 age=10;
		 country="India";
		 color="white";
     }
}
class Tiger extends Animal
{
	Tiger()
	{
		super();
	}
	void getData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
	}
}

public class Code3 {
	public static void main(String[] args) {
		
		Tiger t1=new Tiger();
		t1.getData();
	}

}
