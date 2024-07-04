package eclipsepackage;

import java.util.ArrayList;

public class Collection_Methods1 
{
public static void main(String[] args) 
{
	ArrayList a1= new ArrayList();//Object of ArrayList
	a1.add("Pen");
	a1.add("Pencil");
	a1.add("Book");
	a1.add("Laptop");   
	a1.add(20);
	System.out.println("Before remove method" +a1);
	a1.remove("Pencil");
	System.out.println("After remove method"+ a1);
	
	ArrayList a2= new ArrayList();
	a2.addAll(a1);
	a2.add("Bottle");
	a2.removeAll(a1);
	System.out.println(a2);
	
	System.out.println(a1.size());
	
	ArrayList a3= new ArrayList();
	a3.add(256);
	a3.add("Mobile");
	System.out.println("Before Clear"+ a3);
	a3.clear();
	System.out.println("After clear"  + a3);

	}

}
 