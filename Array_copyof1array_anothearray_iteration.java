package eclipsepackage;

public class Array_copyof1array_anothearray_iteration 
{
public static void main(String[] args) 
{
	int rollno[]=new int[5];
	rollno[0]=11;
	rollno[1]=12;
	rollno[2]=13;
	rollno[3]=14;
	rollno[4]=15;
	
	int rollno_copied[]= new int [rollno.length];
	for(int i=0;i<rollno.length;i++)
	{
		rollno_copied[i]=rollno[i];
	}
	System.out.println();
}
}
