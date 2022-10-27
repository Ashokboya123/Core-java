package EncapsulationExample;
//Shadowing problem
class Dog1{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	//common setter method
   void setData(String name,String color,int cost,int age,String breed)
   {
	  this. name = name;
	  this. color = color;
	  this. cost = cost;
	  this. age = age;
	  this. breed = breed;
   }
   //common getter method
   void getData()
   {
	   System.out.println(name);
	   System.out.println(color);
	   System.out.println(cost);
	   System.out.println(age);
	   System.out.println(breed);
   }
		
	
}

public class Code2 {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.setData("jerry","brown",6000,6,"pug");
		d.getData();
	}

}
