package eclipsepackage;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Try_Catch_AgeSalary 
{
public static void main(String[] args)
	{
	   try
	   {
		   Scanner s1= new Scanner(System.in);
		   System.out.println("Enter valid age");
		   int age= s1.nextInt();
		   		   
		   System.out.println("Enter the salary");
		   double salary= s1.nextDouble();
		  		   
		   System.out.println("Enter your weight");
		   float weight= s1.nextFloat();
		    
		   System.out.println("Enter if you are a student");
		   boolean student= s1.nextBoolean();
		}	
	   catch(InputMismatchException i1)
	   {
		  System.out.println("Enter valid details");
	   }
	  
}
}
