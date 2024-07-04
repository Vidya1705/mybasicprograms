package eclipsepackage;

import java.util.Arrays;

public class String_Anagram 
{
public static void main(String[] args) 
{
	String name1="state";
	String name2="taste";
	   
	          char[] c1= name1.toCharArray();
	          char[] c2= name2.toCharArray();
	          
	          Arrays.sort(c1);
	          Arrays.sort(c2);
	          if  (Arrays.equals(c1, c2)==true)
	    {
	    	System.out.println("This is an Anagram of each other");
	    }
	    else
	    {
	    	System.out.println("This is not an Anagram of each other");
	    }
	          
}
}
