package eclipsepackage;

public class If_Else_If 
{
	public static void main(String[] args) 
	{
		int no1 = 40;
		int no2 = 50;
		int no3 = 60;
		if (no1 > no2) 
		{
			System.out.println("1");
		} 
		else if (no1 > no3) 
		{
			System.out.println("2");
		} 
		else if (no1 < no3) 
		{
			System.out.println("3");
		} 
		else if (no1 > no2) 
		{
			System.out.println("4");
		} 
		else if (no2 > no3) 
		{
			System.out.println("5");
		} else 
		{
			System.out.println("6");
		}
	}
}
