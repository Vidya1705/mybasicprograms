package eclipsepackage;
public class Static_Nonstatic_Constructor_Overloading 
{
	static void add(int a)
	{
		int sum=a+10;
	    System.out.println(sum);
	}
	static void add(short b, int c)
	{
		int sum=b+c+20;
		System.out.println(sum);
	}
	 void add(double a)
     
     {
   	 double sum=5+a;
   	 System.out.println(sum);
     }
     void add(char a)
     {
   	  int sum=6+a;
   	  System.out.println(sum);
     }
    Static_Nonstatic_Constructor_Overloading (String datatype)
    {
    	System.out.println("constructor overloading boolean datatype");
    }
    Static_Nonstatic_Constructor_Overloading (char data)
    {
    	System.out.println("constructor overloading char datatype");
    }
	
public static void main(String[] args) 
{
	add (10);
	add(10+5);
	Static_Nonstatic_Constructor_Overloading S1=new Static_Nonstatic_Constructor_Overloading("boolean");
	S1.add(10);
	S1.add(2.32);
	new Static_Nonstatic_Constructor_Overloading("True");
	new Static_Nonstatic_Constructor_Overloading("A");
	
	
	

	
}
}
