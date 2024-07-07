package Inheritance.Program.Java;
interface Amazon
{
	void loginwithemail();
	void loginwithmobile();
}
public class Interface_Amazon implements Amazon
{
	public void loginwithemail()
	{
		System.out.println("Login with Email");
	}
	public void loginwithmobile()
	{
		System.out.println("Login with Mobile");
	}
public static void main(String[] args) 
{
	Interface_Amazon i1= new Interface_Amazon();
	i1.loginwithemail();
	i1.loginwithmobile();
}
}
