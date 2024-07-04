package eclipsepackage;
public class Throw_ExceptionClass 
{
public static void main(String[] args) 
	{
try 
	{
	    int a=1/0; //b from parent class and c comes from grand parent class
	    // if a=1/1 and print a try block will execute
	    System.out.println(a);
	}
catch(ArithmeticException a1)
	{
		System.out.println("Handled the exception");
	}

	}

}
