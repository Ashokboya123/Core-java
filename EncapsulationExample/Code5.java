package EncapsulationExample;
class Student{
	private String name;
	private String emilId;
	private int age;
	private long phone_no;
	private String college;
	
	public Student() {
		super();
		this.name="ashok";
		this.emilId="boyaashok@gmail.com";
		this.age=21;
		this.phone_no=6305030689l;
		this.college="GQT";
	}

	public Student(String name, String emilId, int age, long phone_no, String college) {
		super();
		this.name = name;
		this.emilId = emilId;
		this.age = age;
		this.phone_no = phone_no;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public String getEmilId() {
		return emilId;
	}

	public int getAge() {
		return age;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public String getCollege() {
		return college;
	}
	
	
}
public class Code5 {
	public static void main(String[] args) {
		Student s1=new Student();//zero parameterized constructor will be called during this object creation
		Student s2=new Student("pavan","pavan@gmail.com",21,6932548992l,"GQT");
       //parameterized constructor will be called above during object creation
		
		System.out.println("Data-1");
		System.out.println(s1.getName()+"---"+s1.getEmilId()+"---"+s1.getAge()+"---"+
		s1.getPhone_no()+"---"+s1.getCollege());
		
		System.out.println("Data-2");

		System.out.println(s2.getName()+"---"+s2.getEmilId()+"---"+s2.getAge()+"---"+
		s2.getPhone_no()+"---"+s2.getCollege());
		
	}

}
