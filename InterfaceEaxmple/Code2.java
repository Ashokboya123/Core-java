package InterfaceEaxmple;
@FunctionalInterface
interface Interface1{
	void add();
	void sub();
	// we cannot create multiple abstract methods inside 
	//the functional interface
}
interface Interface2{
	
}
// interface implements interface is not permitted
interface Interface3 implements Interface1{
	
}
interface Interface4 extends Interface1{
	
}
class Class1{
	
}
class Class2{
	
}
class Test1 implements Interface1,Interface2{
	
}
class Test2 extends Class1,Class2{
	
}
abstract class test3 implements Interface1{
	
}
class Test4 extends Class1 implements Interface2{
	
}

public class Code2 {

}
