package InheritanceExample;
//Tiger is Animal. There exist is relation between Tiger and Animal which exhibited using
//extends keyword.
class Animal
{
	String name;
	int age;
	String country;
	String color;
	//In-case there is no constructor specified by the user  then the complier will place a
	//zero parameterized default constructor
	/*
	public Animal() {
		super();
	}
	*/
}
class Tiger extends Animal
{
	public Tiger() 
	{
		super();
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
		name = "ramu";
		age=10;
		country="india";
		color="white";
	}
	void getData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
		System.out.println(color);
	}
}

public class Code1 {
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.getData();
	}

}
