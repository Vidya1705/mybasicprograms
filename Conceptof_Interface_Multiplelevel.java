package AbstractClass;
interface interface1
{
	void method1();
}
	
	interface interface2	
	{
		void method2();
	}
	
class interface3 implements interface1, interface2
{
	public void method1()
	{
		System.out.println("Concept of interface 1");
	}
	public void method2()
	{
		System.out.println("Concept of interface 2");
	}
}

public class Conceptof_Interface_Multiplelevel 
{
public static void main(String[] args) 
{
	Conceptof_Interface_Multiplelevel c1= new Conceptof_Interface_Multiplelevel();
	c1.method1();
	c1.method2();
}

private void method2() {
	System.out.println(method2);
}

private void method1() {
	System.out.println(method1);
}


	
}
