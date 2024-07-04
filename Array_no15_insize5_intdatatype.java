package eclipsepackage;
public class Array_no15_insize5_intdatatype 
{
	static int check_no=15;

public static void main(String[] args) 
  
{
	int no[]=new int[5];
	no[0]=15;
	no[1]=25;
	no[2]=35;
	no[3]=45;
	no[4]=55;
	
	for(int i=0;i<no.length;i++)
	{
		if(check_no==no[i])
		{
			System.out.println("No. 15 is present in the given Array and the Index");
		}
		
	}

}
}
