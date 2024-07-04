package eclipsepackage;
public class AccessSpecifier_within_theclass 
//check if all the access specifier can be called inside main method. Every method can be accessed
//All methods can be static or non static//
{
	
	public void add()
	{
		
	}
	protected void subtract()
	{
		
	}
	private void Mul()
	{
		
	}
	void Div()
	{
		
	}
public static void main(String[] args) 
{
	AccessSpecifier_within_theclass a1= new AccessSpecifier_within_theclass();
	a1.add();
	a1.subtract();
	a1.Mul();
	a1.Div();
}
}
