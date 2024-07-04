package eclipsepackage;

import java.util.Set;
import java.util.TreeSet;

public class A108_Set_Behaviour
{
public static void main(String[] args) 
	{
		       
           Set s1= new TreeSet();
           s1.add(15);
           s1.add(25);
           s1.add(35);
           s1.add(45);
           System.out.println(s1);
           
           //duplicate
           s1.add(15);
           s1.add(15);
           System.out.println(s1);
           // Will this accept null (will get an exception
         /*  s1.add(null);
           s1.add(null);
           s1.add(null);*/
       	System.out.println(s1);
      //Iterate from Iterator- Yes
      //Iterate from SetIterator- Yes
       	// It gives NullPointerException
       	
       	
       	
	}

}
