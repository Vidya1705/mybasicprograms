package eclipsepackage;

public class Method_Overloading_Static

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
	static void add(double a, double b, int c)
	{
		double sum=a+b+c+30;
		System.out.println(sum);
	}
	
public static void main(String[] args) 
{
	add(50);
	add(50+50);
	add(6.23,2.22,2);
	
	
	
}
	
	
	
	
	
	
	
}
