
package eclipsepackage;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Scannerclass_send5values 
{
public static void main(String[] args) 
{
    int no[]= new int[5];
    Scanner s1=  new Scanner(System.in);
    for(int i=0; i<no.length; i++)
    {
    	no[i] =s1.nextInt();
    }
    System.out.println(Arrays.toString(no));
}
}
