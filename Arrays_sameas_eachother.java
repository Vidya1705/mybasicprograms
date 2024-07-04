package eclipsepackage;

import java.util.Arrays;

public class Arrays_sameas_eachother 
{
public static void main(String[] args) 
{
	int[] array1={1,2,3,4,5};
	int[] array2={1,2,3,4,6};
	
	if (Arrays.equals(array1, array2)==true)
	{
		System.out.println("Both the arrays are same as each other");
	}
	else
	{
		System.out.println("Both the arrays are not same as each other");
	}
	
}
}
