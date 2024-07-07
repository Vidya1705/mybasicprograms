package Inheritance.Program.Java;
class Delhi1
{
	static void method_delhi()
	{
		System.out.println("Delhi");
	}
}
class Chennai1 extends Delhi1
{
	static void method_Chennai()
	{
		System.out.println("Chennai");
	}
}
public class MultiLevelBangalore_static extends Chennai1
{
static void method_Bangalore()
{
	System.out.println("Bangalore");
}


public static void main(String[] args) 
{
	method_delhi();
	method_Chennai();
	method_Bangalore();
}
}
