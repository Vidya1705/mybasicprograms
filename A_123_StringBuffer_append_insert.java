package eclipsepackage;
public class A_123_StringBuffer_append_insert 
{
public static void main(String[] args) 
{
      StringBuffer s1= new StringBuffer("Manish Tiwari");
      
      StringBuffer s2= s1.insert(6, " Kumar");// insert
      System.out.println(s2); 
      StringBuffer s3= s1.append(" Teacher"); //append
      System.out.println(s3);
      StringBuffer s4= s1.replace(7, 12, "Kumar");
      System.out.println(s4);
      StringBuffer s6= new StringBuffer("Buffer");
      StringBuffer s5=s6.reverse();
      System.out.println(s6);
	
	
	
	
	
	
	
	
	
	
	}

}
