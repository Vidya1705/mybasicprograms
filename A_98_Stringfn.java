package eclipsepackage;

import java.util.Arrays;

public class A_98_Stringfn 
{
 public static void main(String[] args) 
	{
		String s1="Vidya";
		System.out.println(s1.equalsIgnoreCase(s1));// EqualsIgnoreCase
        
		
		System.out.println(s1.endsWith("b"));// EndsWith
		System.out.println(s1.endsWith("a"));
		
		String s3= "";
		System.out.println(s3.isEmpty());// IsEmpty
		
		System.out.println(s1.repeat(5));// Repeat
		
		String s4= "My name is Vidya";// Split
		String s5[]= s4.split("n");
		System.out.println(Arrays.toString(s5));
		String s6[]=s4.split("");
		System.out.println(Arrays.toString(s6));
		
		String s7[]= s4.split(" ", 3);// Split with limit
		System.out.println(Arrays.toString(s7));
		
		
		
		
		
		
		
		
	}

}
