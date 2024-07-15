package eclipsepackage;

import java.util.Vector;

public class A_114_Vector_Methods 
{
public static void main(String[] args) 
{

	Vector v1= new Vector();
	v1.add("Sita");
	v1.add("Rita");
	v1.add("Gita");
	v1.add("Nita");
	v1.add("Tita");
	System.out.println(v1);
	
	v1.addElement("Geeta");
	System.out.println(v1);
	
	System.out.println(v1.firstElement());
	
	System.out.println(v1.lastElement());
	
	//System.out.println(v1.removeElement(1));
	v1.removeElementAt(0);
	System.out.println(v1);
	
	//System.out.println(v1.removeElement(v1));
	v1.removeAllElements();
	System.out.println(v1);
	
	System.out.println(v1.capacity());
	//System.out.println(v1);

	
	
	
	
	
	
	
	
	
	
	
	}

}
