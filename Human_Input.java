package eclipsepackage;

import java.util.Scanner;

public class Human_Input 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a= s1.nextInt();
	System.out.println("Enter the value of b");
	int b= s1.nextInt();
	int sum= a+b;
	System.out.println("Addition of a and b"+ sum);
	
	
	
}
}
