package eclipsepackage;

public class String_indexofchar
{
public static void main(String[] args) 
{
	String a="India is my country";
	 int b= a.indexOf("I");// takes in double and single quotes
	 System.out.println(b);
	 int b1= a.indexOf('n');// there are two "n's" and two "y's". which position will it consider first?
	 System.out.println(b1);
     int b2= a.indexOf('y');
     System.out.println(b2);
}
}
