package eclipsepackage;

import java.util.*;

public class New_Exception 
{
public static void main(String[] args) 
	{
		int rollno[]= new int [3];// Array
		rollno[0]=15;
		rollno[1]=19;
		rollno[2]=20;
   try 
   {
		rollno[3]=40;
   }
   catch(ArrayIndexOutOfBoundsException a1)
   {
	   System.out.println("Size was exceeded");
   }
   catch(NullPointerException a2)
   {
	   System.out.println("Size was exceeded");
   }
   catch(InputMismatchException a3)
   {
	   System.out.println("Size was exceeded");
   }
   catch(IllegalFormatException a4)
   {
	   System.out.println("Size was exceeded");
   }
finally
{
	System.out.println("Finally");
}
	}
}
