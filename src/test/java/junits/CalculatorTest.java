package junits;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class CalculatorTest {
	@Tag("sanity")
	@DisplayName("postive test")
	@Test
	public void addTest1()
	{
		
		assertEquals(9,Calculator.add(4, 5));
	}
	
	
	//@CustomAnnotation
	@Tag("sanity")
	public void subTest1()
	{
		
		assertEquals(1,Calculator.sub(5,4));
	}
}
