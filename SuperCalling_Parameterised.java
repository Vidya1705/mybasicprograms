package Inheritance.Program.Java;
class URL
{
	URL(int a)
	{
		System.out.println("URL");
	}
}
class launch_browser extends URL
{
	launch_browser(String Google)
	{
		super(50);
		System.out.println("launch_browser");
	}
}
public class SuperCalling_Parameterised extends launch_browser
{
	SuperCalling_Parameterised ()
	{
		super("Automation");
		System.out.println("SuperCalling_Parameterised");
	}
 public static void main(String[] args) 
{
	 SuperCalling_Parameterised s1= new SuperCalling_Parameterised();	 
}
}
