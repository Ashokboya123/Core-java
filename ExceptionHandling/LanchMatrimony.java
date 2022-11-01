package ExceptionHandling;

import java.util.Scanner;

class OverAgeException extends Exception //OverAgeException is-a Exception
{
	public String getMessage() {
		return "we don't entertain Senior citizen's profile for the matrimony";
	}
}
class UnderAgeException extends Exception{
	public String getMessage() {
		return "we don't entertain minor's  profile for the matrimony";
	}
}
class MatrimonyCandidate{
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = sc.nextInt();
	}
	void varify()throws OverAgeException,UnderAgeException {
		if(age>60)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else if(age<18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else {
			System.out.println("Welcom to the world of matrimony. Plese subscribe by paying 5000rs to matrimony");
		}
	}
}
class MatrimonyApp{
	void useApp(MatrimonyCandidate mc) {
		try {
			//1
		mc.getData();
		mc.varify();//Critical statement
		}
		catch(OverAgeException|UnderAgeException e1) {
			
		}
		try {
			//2
		mc.getData();
		mc.varify();//Critical statement
		}
		catch(OverAgeException|UnderAgeException e2) {
			
		}
		try {
			//3
		mc.getData();
		mc.varify();//Critical statement
		}
		catch(OverAgeException|UnderAgeException e3) {
			System.out.println("Candidate account is blocked");
		}
	}
}
public class LanchMatrimony {
	public static void main(String[] args) {
		MatrimonyCandidate mc1 = new MatrimonyCandidate();
		MatrimonyCandidate mc2 = new MatrimonyCandidate();
		MatrimonyCandidate mc3 = new MatrimonyCandidate();
		MatrimonyCandidate mc4 = new MatrimonyCandidate();
		
		MatrimonyApp mapp = new MatrimonyApp();
		System.out.println("candidate-1");
		mapp.useApp(mc1);
		System.out.println("candidate-2");
		mapp.useApp(mc2);
		System.out.println("candidate-3");
		mapp.useApp(mc3);
		System.out.println("candidate-4");
		mapp.useApp(mc4);
	}

}
