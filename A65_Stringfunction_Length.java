package eclipsepackage;

public class A65_Stringfunction_Length 
{
public static void main(String[] args) 
{
	String name= "vidya";
	  int lengthofString= name.length();
	  System.out.println(lengthofString);
    //String functions- 
    //toUppercase- converting name into Uppercase  
    //tolowercase- converting name into lowercase//
    
    
    String a1=name.toUpperCase();	  
    System.out.println(a1);
    
    String a2= "MY NAME IS VIDYA"; //16
    int length= a2.length();
    System.out.println(length);
    
    
    String a3= a2.toLowerCase();
    System.out.println(a3);
	
	
	
}
}
