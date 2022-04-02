package junits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class StringFunctionTest {
	
	
	
	@Test()
	public void test1()
	{
		
	assertTrue(StringFunctions.isPalindrome("madam"))	;
	assertTrue(StringFunctions.isPalindrome("racecar"))	;
	
	System.out.println("Palidrom string");
		
	}
	
	@Test()
	public void test2()
	{
		
	assertFalse(StringFunctions.isPalindrome("lakhi"))	;
	
	System.out.println(" not Palidrom string");
		
	}
	
}
	
	
