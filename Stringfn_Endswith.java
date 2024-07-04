package eclipsepackage;

import java.util.Arrays;

public class Stringfn_Endswith 
{
	static int count_of_digit=0;
public static void main(String[] args) 
{
	   String name= "Tom and Jerry";
	   
	   boolean a= name.contains("Tom");//contains
	   System.out.println(a);
	
	   boolean b= name.endsWith("Jerry");//Ends with
	   System.out.println(b);
	   
	   char c1[] = name.toCharArray();
	   System.out.println(Arrays.toString(c1));//toCharArray
	     
	 //In a given string how many are numeric letters//
	     
	     String a1= "String123";
	     for(int i=0; i<=a1.length(); i++)
	     {
	    	 boolean b1= Character.isDigit(c1[i]);
		    // System.out.println(b1);
	    	 if (b1==true)
	    	 {
	    		 count_of_digit++;
	    	 }
	    	 
	     }
	     System.out.println("Count of digits-->"+ count_of_digit);
	     
	    /* boolean b2=Character.isDigit(c1[3]);
	     System.out.println(b2);*/
	     //Find how many are alphabets in the given String
}
}
