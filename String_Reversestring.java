package eclipsepackage;
public class String_Reversestring 
{
   public static void main(String[] args) 
	{
		String name="mom";
		String input=name.toLowerCase();
		String reverse="";
			for (int i= input.length()-1; i>=0; i--)
		{
			char c1= input.charAt(i);
			reverse= reverse+c1;
		}
		System.out.println(reverse);
		boolean result= name.equals(reverse);
		System.out.println(result);
			if(result==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		
		/*for(int i=name.length()-1;i>=0;i--);
		{
			System.out.println(name.charAt(i));
		}*/    //Don't use this 

		
		
	}

}
