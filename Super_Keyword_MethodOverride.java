package Inheritance.Program.Java;
class Super_Keyword
{
	void login()
	{
		System.out.println("Login with No.");
	}
		
}
public class Super_Keyword_MethodOverride extends Super_Keyword
{
	void login()
	{
		
		System.out.println("Login with email");
		super.login();
	}
	public static void main(String[] args) 
	{
		Super_Keyword_MethodOverride s1= new Super_Keyword_MethodOverride();
		s1.login();
		

	}
}
