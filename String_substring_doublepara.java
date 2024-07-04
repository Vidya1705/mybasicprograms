package eclipsepackage;
public class String_substring_doublepara 
{
public static void main(String[] args) 
{
	String c= "Go Green India";
	String c1= c.substring(3, 8);
	System.out.println(c1);
	
	/*String c2= c.substring(9, 15); //If we exceed the count we get StringIndexOutOfBoundsException
	System.out.println(c2);
	
	String c3= c.substring(9, 14); // This will not run since we got an exception above
	System.out.println(c3);*/
}
}
