package IntrestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntrestTest {
	
	Intrest intrest=new Intrest();

	
	@Test
	public void SimpleIntrestest() 
	{
		assertEquals(400,intrest.SimpleIntrest(5000,2,4),0.0);
		
	}
	@Test
	public void CompoundIntrestest() 
	{
		assertEquals(288.00,intrest.CompundInterst(200,20,2),0.0);
		
	}


}
