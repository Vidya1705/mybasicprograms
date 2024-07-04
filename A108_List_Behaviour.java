package eclipsepackage;

import java.util.ArrayList;
import java.util.List;

public class A108_List_Behaviour
{
public static void main(String[] args) 
{
  //Upcasting arraylist to list
	List l1= new ArrayList();
	//Check Indexing
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	System.out.println(l1);
	//duplicate
	l1.add(20);
	l1.add(20);
	System.out.println(l1);
	//null checking
	l1.add(null);
	l1.add(null);
	l1.add(null);
	System.out.println(l1);
	//Iterate from Iterator- Yes
	//Iterate from ListIterator- Yes
	
	

	}

}
