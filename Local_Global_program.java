package eclipsepackage;

public class Local_Global_program 
{
      int age=10;
      static String name="Vids";
	
public static void main(String[] args) 
{
	name="Vidya";//update static variable
	System.out.println(name);
	
	//To update non static variable, create an object//
	Local_Global_program L1= new Local_Global_program();
	System.out.println(L1.age);
	System.out.println(L1.age=90);// Updated the value
	
}	
	
	
	
	
}
