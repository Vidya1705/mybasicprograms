package eclipsepackage;

import java.util.Scanner;

public class Switchcase_AddSub_MulDiv 
{
	static Scanner s1= new Scanner(System.in);
    static int a=s1.nextInt();

	static int b=s1.nextInt();

	static int c=s1.nextInt();
	
public static void main(String[] args) 
{
	switch(c)
	{
	   case 1:
	    int sum=a+b;
	    System.out.println("addition" +sum);
	    break;
	  case 2:
		  int sub=a-b;
		  System.out.println("subtracion" +sub);
		  break;
	  case 3:
		  int mul=a*b;
		  System.out.println("multiplication" +mul);
		  break;
	  case 4:
		  int div=a/b;
		  System.out.println("division" +div);
		  break;
	  case 5:
		  int mod=a%b;
		  System.out.println("modolus" +mod);
		  break;
	  default:
		  System.out.println("no operator");
	}

}
}
		  
		  

		

		

	

	

	

	

	

	

	

	

	

	

	

	

	

	

		

	

   

	

	

			

	

		
