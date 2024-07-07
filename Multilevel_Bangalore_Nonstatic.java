package Inheritance.Program.Java;
class Delhi
{
	void method_Delhi()
	{
		
	}
		
}
class Chennai extends Delhi
{
	void method_Chennai()
	{
		
	}
		
}
   public class Multilevel_Bangalore_Nonstatic extends Chennai
{
		void method_Bangalore()
		{
			
		}
			
public static void main (String[]args)
{
	Multilevel_Bangalore_Nonstatic b1= new Multilevel_Bangalore_Nonstatic();
	b1.method_Bangalore();
	b1.method_Bangalore();
	b1.method_Delhi();
}
	
}
 
