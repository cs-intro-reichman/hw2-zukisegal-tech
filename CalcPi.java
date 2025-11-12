// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args)
	 { 
		int N= Integer.parseInt(args[0]);
		double sum=0.0;
		

	for(int i=0; i<N; i++)
		{
			double plus=1.0/((2*i)+1);
			if(i%2==0)
			{
				sum= sum + plus;
			}
			else
			{
				sum= sum - plus;
			}
			
			
		}
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated: " + String.format("%22.15f", 4.0*sum));

	    
	}
}
