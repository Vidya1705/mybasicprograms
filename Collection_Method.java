package eclipsepackage;
import java.util.ArrayList;
public class Collection_Method 
{
public static void main(String[] args) 
{
	ArrayList a1= new ArrayList();//Object of ArrayList
	a1.add("Pen");
	a1.add("Pencil");
	a1.add("Book");
	a1.add("Laptop");   
	a1.add(20);
	a1.add(null);
	System.out.println(a1);// add Method-add elements in the form of an Object. Any type of data can be stored
	
	ArrayList a2= new ArrayList();
	a2.addAll(a1);         // addAll Method- Wecan add collection
	a2.add("Mobile");
	System.out.println(a2);
	
	System.out.println(a2.contains("Book"));// Contains method
	System.out.println(a2.containsAll(a1)); // containsAll- a2 has all present in a1
	System.out.println(a2.isEmpty());
	
	ArrayList a3= new ArrayList ();
	System.out.println(a3.isEmpty());
	

	}

}
