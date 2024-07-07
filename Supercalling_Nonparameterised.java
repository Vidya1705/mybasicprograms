package Inheritance.Program.Java;
class set_URL
{
	set_URL()
	{
		System.out.println("URL");
	}
}
class launchbrowser extends set_URL
{
	launchbrowser()
	{
		super();
		System.out.println("Launch Browser");
	}
}
public class Supercalling_Nonparameterised extends launchbrowser
{
	Supercalling_Nonparameterised ()
	{
		super();
		System.out.println("Non Parameterised");
	}
	public static void main(String[] args) 
	{
		Supercalling_Nonparameterised s1= new Supercalling_Nonparameterised();
		
	}
}
