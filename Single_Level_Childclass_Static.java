package Inheritance.Program.Java;
class Parentclass1
{
  static void add()
  {
	  int a=10;
	  int b=20;
	  int sum=a+b;
	  System.out.println(sum);
	    
  }
}
public class Single_Level_Childclass_Static extends Parentclass1
{
	static void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println(sub);	
	}
	
	public static void main(String[] args) 
	{
	    add();
	    sub();
	}
	
}