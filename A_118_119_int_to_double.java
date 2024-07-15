package TypeCasting_Primitive;
public class A_118_119_int_to_double 
{
public static void main(String[] args) 
{
        double a= 200; // int to double- implicitly
        System.out.println(a);
	 
        double b=(double) 2556452;// int to double- Explicitly
        System.out.println(b);
        
        int c= (int) 15.5;// double to int- Explicitly
        System.out.println(c);
        
        double wt= 50.6;
        int d= (int) wt;
        System.out.println(d);

	}

}
