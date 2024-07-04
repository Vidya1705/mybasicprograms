package eclipsepackage;
public class Array_Averageof4no_intdatatype 
{
	public static void main(String[] args) 
	{
		int no[]= new int [4];// Object of an Array
		no[0]=10;
		no[1]=23;
		no[2]=56;
		no[3]=89;
	
        int sum=0;
        double average=4;
        
        for(int i=0; i<no.length;i++)
        {
        	sum= sum+no[i];
        }
        System.out.println("Sum of 4 numbers" + sum);
        
        average= sum/no.length;
        System.out.println("Average of 4 numbers" + average);
	}


}
