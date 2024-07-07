package Inheritance.Program.Java;
public class This_Calling_Statement 
{
   
	This_Calling_Statement(int a)
	{
		System.out.println("1");
	}

	This_Calling_Statement(int a, int b)
	{
		this(50);
		System.out.println("2");
	}

	This_Calling_Statement(double a, int b)
	{
		this(20,30);
		System.out.println("3");
	}
	

	public static void main(String[] args) 
	{
		This_Calling_Statement t1= new This_Calling_Statement(10.32, 4569);
		
	}
}
