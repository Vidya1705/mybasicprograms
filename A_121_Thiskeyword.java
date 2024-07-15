package TypeCasting_Primitive;
public class A_121_Thiskeyword
{

	int age;
	String name;
	double salary;
	void student_details(int age,String name,double salary)
	{
		this.age=age;//local to global 
		this.salary=salary;
		this.name=name;
	}
public static void main(String[] args) 
{
	A_121_Thiskeyword t1=new A_121_Thiskeyword();
	t1.student_details(30, "Vids",12345);
	System.out.println(t1.salary);
	System.out.println(t1.name);
	System.out.println(t1.age);
      
  
	
	
	
	
	}

}
