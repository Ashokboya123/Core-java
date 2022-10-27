package EncapsulationExample;
//Example for condition:3 of Encapsulation
class GQTBank
{
	private int accountNo;
	private int balance;
	private String cust_name;
	private int pin;
	
	void setData(int accountNo,int balance,String cust_name,int pin) 
	{	
		this.accountNo=accountNo;
		this.balance=balance;
		this.cust_name=cust_name;
		this.pin=pin;
	}
	void getData()
	{
		System.out.println(accountNo);
		System.out.println(balance);
		System.out.println(cust_name);
		System.out.println(pin);
	}
	void updateDeposit(int amount)
	{
		if(amount<1000)
		{
			System.out.println("the amount to be deposited should be above Rs.1000");
		}
		else
		{
			this.balance=this.balance+amount;
			System.out.println("Amount deposited. The updated balance is:"+balance);
		}
	}
	
}
public class Code3 {
	public static void main(String[] args) {
		GQTBank g = new GQTBank();
		g.setData(12456, 500, "ashok", 4456);
		g.getData();
		g.updateDeposit(1000);
		g.getData();
	}

}
