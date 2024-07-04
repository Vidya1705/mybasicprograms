package eclipsepackage;
public class A_82_88_ // Assignment- 83-88
{
public static void main(String[] args) 
{
		String name="vidya";
		String name1= name.replaceAll("a", ""); //Remove "a" from String
		System.out.println(name1);
		System.out.println(name.replaceAll("a", "d"));// Add "d" inthe string
		
		String s1="my name is vidya";
		String name2= (s1.replaceAll(" ", "")); // Remove space
        System.out.println(name2);
        
        String s2="VidyaA";
        System.out.println(s2.replaceAll("[A-Z]", ""));// Remove all capital letters
        
        String s3="VIDya";
        System.out.println(s3.replaceAll("[a-z]", ""));// Remove all small letters
        
        String s4="Vidya123";
        System.out.println(s4.replaceAll("[0-9]", " "));
        
        
        
        
        
        
	}

}
