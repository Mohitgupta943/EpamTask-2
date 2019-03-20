package IntrestCalculator;

public class Intrest 
{
	
	public double SimpleIntrest(int P,int rate,int time)   //P : Principle Amount
	{
		return (P*rate*time)/100;
		
		
	}
	
	public double CompundInterst(double P,double rate,int time)   //P : Principle Amount

	{
		double CI= (1+(rate/100));
		
		return  P*(double)Math.pow(CI,time);
	}
}
