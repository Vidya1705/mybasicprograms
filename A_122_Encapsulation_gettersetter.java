package TypeCasting_Primitive;
class Getter_setter
{
	private int age=18; //this is for default
	
	public int getAge()// to get the new age
	{
		return age;// in RETURN keyword, void cannot be used. so makeit int
	}
	public void setAge()
	{
		this.age= age;
	}
	private String username="Vidya";

	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	
}
public class A_122_Encapsulation_gettersetter 
{
public static void main(String[] args) 
	{
	Getter_setter g1= new Getter_setter();
	//g1.setAge(50);
	System.out.println(g1.getAge());
	g1.setUsername("Vidya");
	System.out.println(g1.getUsername());
	
	
	}

}
