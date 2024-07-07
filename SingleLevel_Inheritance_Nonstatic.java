package Inheritance.Program.Java;
class ParentClass
{
	void add()
	{
		int a=5;
		int b=5;
		int sum=(a+b);
		System.out.println(sum);	
	}
public static void main(String[] args) 
{
	SingleLevel_Inheritance_Nonstatic m1= new SingleLevel_Inheritance_Nonstatic();
	m1.add();
	m1.sub();
}
}
public class SingleLevel_Inheritance_Nonstatic extends ParentClass
{
void sub() 
{
   int a=50;
   int b=60;
   int sub=(a-b);
   System.out.println(sub);
}
}













