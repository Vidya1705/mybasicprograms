package eclipsepackage;

import java.util.Scanner;

public class Area_of_Rectangle_ScannerClass 
{
	
public static void main(String[] args) 

{
	int l,b, area;
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter length of rectangle");
	l=s1.nextInt();
	System.out.println("Enter the width of rectangle");
	b=s1.nextInt();
    area= l*b;
    System.out.println("Area of Rectangle is--" + area);
	
}
}
