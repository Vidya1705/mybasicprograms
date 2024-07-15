package eclipsepackage;
public class A_118_Primitive_DblWidening 
{
public static void main(String[] args) 
{
	//int into double
      double a1= 100; //widning- Implicitly
      System.out.println(a1);
      
      double a2=(double) 1234; //widning- Explicitly
      System.out.println(a2);
      
      //Double into int
      int a3= (int) 15.2; //Narrowing can only be done explicitly
      System.out.println(a3);
      
      double wt=90.2356;
      int a4= (int)wt;
      System.out.println(a4);
      
      
      
      
	
	
	
	

	}

}
