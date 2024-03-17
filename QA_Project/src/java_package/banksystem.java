package java_package;

public class banksystem {
	
	banksystem(String user,String pass)
	{
		System.out.println(user+ " "+pass);
	}

	int amt =5000;
	void deposit(int dp)
	{
		 amt=amt+dp;
		 System.out.println("The amount after dep0sit "+amt);
	}
	void withdraw(int wt)
	{
		amt=amt-wt;
//		System.out.println("The amount after withdraw "+amt);
	}
	
	int display()
	{
		return amt;
	}
	public static void main(String[] args) {
		
		// Create a object
		banksystem obj= new banksystem("Hamil12","1234");
//		obj.deposit(2000);
//		obj.withdraw(1000);
		
		System.out.println(obj.display());
		
		
	}

}
