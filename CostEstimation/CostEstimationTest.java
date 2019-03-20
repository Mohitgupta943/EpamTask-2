package CostEstimation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CostEstimationTest {

	CostEstimator ce= new CostEstimator();
	@Test
	public void test() 
	{
	   assertEquals(2400000,ce.EstimatedCost(2000,"standard"),0.0);	
	   assertEquals(5000000,ce.EstimatedCost(2000,"Automated"),0.0);	
		
	}

}
