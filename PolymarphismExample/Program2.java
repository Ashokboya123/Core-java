package PolymarphismExample;
class Heart{
	private int weight;
	private int heartbeat;
	public Heart(int weight, int heartbeat) {
		super();
		this.weight = weight;
		this.heartbeat = heartbeat;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeartbeat() {
		return heartbeat;
	}
	
}
class Brain{
	private int weight;
	private int memory;
	public Brain(int weight, int memory) {
		super();
		this.weight = weight;
		this.memory = memory;
	}
	public int getWeight() {
		return weight;
	}
	public int getMemory() {
		return memory;
	}
	
}
class Book{
	private String name;
	private int cost;
	public Book(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}
class Bike{
	private String company;
	private int cost;
	public Bike(String company, int cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	public String getCompany() {
		return company;
	}
	public int getCost() {
		return cost;
	}
	
}
class Student{
	Heart h = new Heart(200,72);
	Brain b = new Brain(250,5000);
	void hasA(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getCost());
	}
	void hasa(Bike b) {
		System.out.println(b.getCompany());
		System.out.println(b.getCost());
	}
}

public class Program2 {
	public static void main(String[] args) {
		Book b = new Book("Genral Konlodge",150);
		Bike bb = new Bike("Honda",50000);
		Student s = new Student();
		
		System.out.println(s.h.getHeartbeat());
		System.out.println(s.h.getWeight());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getMemory());
		s.hasa(bb);
		s.hasA(b);
	}

}
