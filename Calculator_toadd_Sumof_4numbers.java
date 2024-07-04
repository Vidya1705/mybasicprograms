package eclipsepackage;

import java.util.Scanner;

public class Calculator_toadd_Sumof_4numbers 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a= s1.nextInt();
	System.out.println("Enter the value of b");
	int b= s1.nextInt();
	System.out.println("Enter the value of c");
	int c= s1.nextInt();
	System.out.println("Enter the value of d");
	int d= s1.nextInt();
	int sum= a+b+c+d;
	System.out.println("Sum of 4 numbers"+ sum);
    }
}
