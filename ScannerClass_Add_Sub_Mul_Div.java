package eclipsepackage;

import java.util.Scanner;

public class ScannerClass_Add_Sub_Mul_Div 

{
	  static Scanner s1= new Scanner(System.in);
 
 
        static void add()
        {
        	System.out.println("Enter the value of a and b for addition");
        	int a = s1.nextInt ();
        	int b = s1.nextInt ();
        	int sum= a+b;
        	System.out.println("Addition of 2 numbers is--"+ sum);
        }
 
        static void Sub()
        {
        	System.out.println("Enter the value of a and b for Subtraction");
        	int a = s1.nextInt ();
        	int b = s1.nextInt ();
        	int sub= a-b;
        	System.out.println("Subtraction of 2 numbers is--" + sub);
        }
        

		static void Mul()
        {
			System.out.println("Enter the value of a and b for Multiplication");
			int a = s1.nextInt ();
        	int b = s1.nextInt ();
        	int Multiply= a*b;
        	System.out.println("Multiply of 2 numbers is--"+ Multiply);
        }
  

		static void Div()
        {
			System.out.println("Enter the value of a and b for Division");
        	int a = s1.nextInt ();
        	int b = s1.nextInt ();
        	int Divide= a/b;
        	System.out.println("Divide of 2 numbers is--"+ Divide);
        }
        static void Mod()
        {
        	System.out.println("Enter the value of a and b for Modulus");
        	int a = s1.nextInt ();
        	int b = s1.nextInt ();
        	int Mod= a%b;
        	System.out.println("Mod of 2 numbers is--"+ Mod);
        }
 
 public static void main(String[] args) 
 {
	 add();
	 Sub();
	 Mul();
	 Div();
	 Mod();
}
 
 
 
 
 
 
}
