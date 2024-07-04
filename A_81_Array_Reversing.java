package eclipsepackage;
import java.util.Arrays;
public class A_81_Array_Reversing //Reversing the Array and store it in another Array
{
          static int k=0;
	public static void main(String[] args) 
	{
		int rollno[]= {1,2,3,4,5};
		int rollno_reverse[]= new int [rollno.length];
		for (int i=rollno.length-1;i>=0;i--)
		{
			
			rollno_reverse[i]=  rollno[k];
			k++;
		}
          System.out.println(Arrays.toString(rollno));
          
          System.out.println(Arrays.toString(rollno_reverse));
	}

}
