package CostEstimation;

public class CostEstimator 
{
	public double EstimatedCost(double Area,String type)
	{
		if(type.equals("standard"))
		{
			return Area*1200;
		}
		
		else if(type.equals("above standard"))
		{
			return Area*1500;
		}
		
		
		else if(type.equals("high standard"))
		{
			return Area*1800;
		}
		
		else
		{
			return Area*2500;
		}
		
	}

}
