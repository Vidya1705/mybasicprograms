package eclipsepackage;
public class A_116_AssertKeyword 
{
public static void main(String[] args) 
{
        String name= "Sita";
        System.out.println(name.concat(" Ram"));
	
	    String name1= "Ram";
	    assert name1.length()>2;//Condition is true
	    System.out.println(name1);
	
	   int a=50;
	      int b=100;
	   // assert a>50:"condition is wrong";
	    assert a>40:"condition is right";
	    int sum=a+b;
	    System.out.println(sum);
	
	}

}
