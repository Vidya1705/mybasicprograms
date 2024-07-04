package eclipsepackage;
public class Contructor_Overloading 
{
	Contructor_Overloading(int a)
	{
		System.out.println("int datatype");
	}
	Contructor_Overloading(boolean b)
	{
		System.out.println("boolean datatype");
	}
	Contructor_Overloading(char c)
	{
		System.out.println("char datatype");
	}
	Contructor_Overloading(String d)
	{
		System.out.println("String datatype");
	}
	
	
public static void main(String[] args) 
{
	Contructor_Overloading C1=new Contructor_Overloading (10);
	Contructor_Overloading C2=new Contructor_Overloading (true);
	Contructor_Overloading C3=new Contructor_Overloading ('A');
	Contructor_Overloading C4=new Contructor_Overloading ("Automation Testing");
	
	new Contructor_Overloading (10);
	new Contructor_Overloading (true);
	new Contructor_Overloading ('A');
	new Contructor_Overloading ("Automation Testing");
	
	
}
	
	
}
