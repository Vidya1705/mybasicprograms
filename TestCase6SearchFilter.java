package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.searchfilterpage_6;

public class TestCase6SearchFilter extends Launch_Quit
{
	@Test
	   public void searchresults()
	   {
		   Homepage h1= new Homepage(driver);
		   h1.search("shoe"); 
		   
		   searchfilterpage_6 s1= new searchfilterpage_6(driver);
		   s1.categories();
		   
				                       
}
}
