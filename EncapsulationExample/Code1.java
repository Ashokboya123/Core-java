package EncapsulationExample;
class Dog{
	//has part
	//To achieve encapsulation make the properties (has part) as private
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	// Common Setters and Getters
	//setter method to allocate values to the private variables (properties)
	void setData(String s1,String s2,int i1,int i2,String s3) {
		name = s1;
		color = s2;
		cost = i1;
		age = i2;
		breed = s3;
	}
	//getter method to retrieve values of the private variables(properties)
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
	}
	// independent setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	//does part
	void run() 
	{
		System.out.println("Dog runs");
	}
	void sleep()
	{
		System.out.println("Dogs sleeps");
	}
	
}

public class Code1 {
	public static void main(String[] args) {
		Dog d = new Dog();
//Since we have implemented the concept of Encapsulation in the class Dog,we will not able to add values
//to the properties which are made as private  directly because private members cannot be accessed outside
//the class
		//d.name ="tom";
     //	d.color="white";
	  //d.cost=5000;
		//d.age=3;
		//d.breed="GR"
		System.out.println("------Common setter and getter result-----");		
		d.setData("tom", "white",5000, 4, "GR");
		d.getData();
		
		System.out.println("------------------");
		System.out.println("--Independent setter and getter result---");
		d.setName("Bruno");
		System.out.println(d.getName());
		d.setColor("Black");
		System.out.println(d.getColor());
		d.setCost(4000);
		System.out.println(d.getCost());
		d.setAge(6);
		System.out.println(d.getAge());
		d.setBreed("GR");
		System.out.println(d.getBreed());
//Since we have implemented the concept of Encapsulation in the class Dog,we will not able to add values
//to the properties which are made as private  directly because private members cannot be accessed outside
//the class
//
//		System.out.println(d.name);
//	    System.out.println(d.name);		
//		System.out.println(d.cost);
//		System.out.println(d.age);
//		System.out.println(d.breed);
		
		
		System.out.println("--------Does part output------");
		d.run();
		d.sleep();
		
				
	}

}
