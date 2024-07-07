package Inheritance.Program.Java;

class Method_parent
{
	void login()
	{
		System.out.println("Login with mobile no.");
	}
}

public class Method_Overriding extends Method_parent
{
	void login()
	{
		System.out.println("Login with email id");
	}
	
	public static void main(String[] args) 
	{
		Method_Overriding m1= new Method_Overriding();
		m1.login();
		
	}
}
