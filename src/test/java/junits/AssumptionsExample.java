package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {
	
	
	@BeforeAll
	public static void Setup() {
		
		System.setProperty("ENV", "PROD");
		
		
	}
	
	
	@Test()
	public void test1()
	{
	assertTrue("PROD".equals(System.getProperty("ENV"))	);
	assertFalse("PROD1".equals(System.getProperty("ENV")));
	
	
	assertTrue(StringFunctions.isPalindrome("madam"))	;
	assertTrue(StringFunctions.isPalindrome("racecar"))	;
		
	}
	

}
