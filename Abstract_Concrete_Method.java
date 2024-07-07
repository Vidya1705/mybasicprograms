package AbstractClass;
class concrete1
{
	void concretecls1()
	{
		System.out.println("Concrete Method 1");
	}
	void concretecls2()
	{
		System.out.println("Concrete Method 2");
	}
}
abstract class class1 extends concrete1
{
	abstract void abstract1();
	abstract void abstract2();//727
	
	
	static void concrete1()
	{
		System.out.println("Abstract Concrete Method 1");
	}
	static void concrete2()
	{
		System.out.println("Abstract Concrete Method 2");
	}
}

public class Abstract_Concrete_Method extends class1
{
    static void method3()
{
    	System.out.println("Concrete Method 3");
}
   static void method4()
{
	   System.out.println("Concrete Method 4");
}
public static void main(String[] args) 
{
	Abstract_Concrete_Method a1= new Abstract_Concrete_Method();
	
	a1.concretecls1();	
	a1.concretecls2();	
	concrete1();
	concrete2();
	method3();
	method4();
}
void abstract1()
{
	
}
void abstract2() 
{
	
}

}
