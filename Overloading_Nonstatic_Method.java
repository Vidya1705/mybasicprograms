package eclipsepackage;

public class Overloading_Nonstatic_Method
{
      void add(double a)
      
      {
    	 double sum=5+a;
    	 System.out.println(sum);
      }
      void add(int a)
      {
    	  int sum=6+a;
    	  System.out.println(sum);
      }
	
public static void main(String[] args) 
{
	Overloading_Nonstatic_Method O1=new Overloading_Nonstatic_Method();
	O1.add(6.32);
	O1.add(10);
}
	
	
	
	
	
	
	
	
}
