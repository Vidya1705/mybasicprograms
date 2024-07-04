package eclipsepackage;

public class OverloadMainmethod_Nonstatic 
{
	public void main()
	{
		System.out.println("Non-static main method without arguments");
	}
	public void main(int number)
	{
		System.out.println("Non-static main method with int");
	}
	public void main(double salary)
	{
		System.out.println("Non-static main method woth double");
	}
public static void main(String[] args) 
{
OverloadMainmethod_Nonstatic o1= new OverloadMainmethod_Nonstatic ();
o1.main();
o1.main(0);
o1.main(0);
}
}

	


