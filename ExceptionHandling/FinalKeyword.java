package ExceptionHandling;
// Final keyword:
//===> If used with the variable then we cannot change the value of the variable
//---> If used with the method then we cannot override the method
//---> If used with the class then class cannot be inherited
final class ExampleNo1
{
	final int var = 20;
	void changeData() {
		var = 40;//error:var is final and we cannot change the value of final variables
		
	}
	final void demo() {
		System.out.println("hi from demo of exampleNo-1");
	}
}
class ExampleNo2 extends ExampleNo1{//error:ExampleNo1 is final and we cannot inherit a final class
	@Override
	void demo()//error:demo() is final method and we cannot override the final methods
	{
		
	}
}
public class FinalKeyword {

}
