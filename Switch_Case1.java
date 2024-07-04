package eclipsepackage;

import java.util.Scanner;

public class Switch_Case1 
{
public static void main(String[] args) 
{
	Scanner  s1= new Scanner (System.in);
	System.out.println("Choose the browser to launch");
	System.out.println("Choose 1 for safari, choose2 for chrome,choose 3 for edge, choose 4 for firefox");
	int a=s1.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("Launch Safari");
	
	case 2:
		System.out.println("Launch chrome");
		break;
	case 3:
		System.out.println("Launch edge");
		break;
	case 4:
		System.out.println("Launch firefox");
		break;
	default:
		System.out.println("Launch firefox");
	}
	
	
}
}
