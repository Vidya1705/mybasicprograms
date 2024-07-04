package eclipsepackage;

public class Global_Program 
{

	static double pi=3.14; //Global variable
	static void area()
	{
		int r=7;
		double area=pi*r*r;
		System.out.println(area);
	}
	
public static void main(String[] args) 
	{
		int r=10; // Created one more variable as name locally
	double area=pi*r*r;
	System.out.println(area);
	area(); //call area method
	}
}


