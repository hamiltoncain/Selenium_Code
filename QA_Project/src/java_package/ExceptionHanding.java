package java_package;

public class ExceptionHanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i =1/0;
		}
		catch(Exception e)
		{
			System.out.println("Can't divide by zero");
		}
	}

}
