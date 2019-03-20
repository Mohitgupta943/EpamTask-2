package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{
SimpleCalculator sc=new SimpleCalculator();
	@Test
	public void Addtest() 
	{
		assertEquals(50,sc.add(30, 20));
		assertEquals(0,sc.add(-30, 30));
		
	}
	@Test
	public void SubtactTest()
	{

		assertEquals(10,sc.subtract(30, 20));
		assertEquals(-60,sc.subtract(-30, 30));
		
	}
	@Test
	public void MultiplyTest()
	{

		assertEquals(600,sc.multiply(30, 20));
		assertEquals(-900,sc.multiply(-30, 30));
		
	}
	@Test
	public void DivisonTest()
	{

		assertEquals(1,sc.divide(30, 20));
		assertEquals(-1,sc.divide(-30, 30));
		
	}

}
