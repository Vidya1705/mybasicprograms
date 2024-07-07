package AbstractClass;
abstract class abstract1
{
	abstract void class1();
	{
		System.out.println("Abstract class 1");
	}
}
public class Abstractwithconcrete extends abstract1
{
   void concrete1()
  {
	  System.out.println("Concrete class 1");
  }
  public static void main(String[] args) 
  {
	  Abstractwithconcrete a1= new Abstractwithconcrete();
	  a1.class1();
	  a1.concrete1();
	 }

void class1() 
{
}
}
