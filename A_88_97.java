package eclipsepackage;
public class A_88_97 
{
   public static void main(String[] args) 
	{
		String s1= "Go Green";
		/*boolean b1= (s1.matches("....")
				System.out.println(b1);*/
		System.out.println(s1.matches("...."));// Given string has 4 letters in it
		System.out.println(s1.matches("(.*)a"));// If string ends with "A"
		System.out.println(s1.matches("k(.*)"));// If string starts witH "K"
		System.out.println(s1.matches("(.*)M(.*)"));// If "M" is present or not
		System.out.println(s1.matches("(.*)e(.*)"));// If "E"is present or not
		System.out.println(s1.matches(".r(.*)")); //If "R" is there at the 2nd place or not
		
		String s2="Automation Testing";
		System.out.println(s2.matches("........n*"));
		System.out.println(s2.matches("S....H"));
		
		
		
	
		
		
		
		
		
	   
	   
	   
	   
	   

	}

}
