package eclipsepackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Exception 
{
	public static void main(String[] args) 
{
	Scanner s1= new Scanner(System.in);
try
{
	System.out.println("Enter the valid age");
	int age= s1.nextInt();
}    
catch(InputMismatchException i1)
{
	Scanner s2= new Scanner(System.in);
	int age= s2.nextInt();
	System.out.println("Age must be valid");
}
    String name= s1.next();
    System.out.println(name);
	


}
}
