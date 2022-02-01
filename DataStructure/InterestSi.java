import java.util.*;
public class InterestSi {
	public static double simpleIntrest(double p, double r,double t )
	{
		double si;
		si=(p*r*t)/100;
		return si;
	}
	public static double compoundIntrest(double p, double r,double t, double n )
	{
		double c;
		 c = p* (Math.pow((1 + r/100), (t * n))) - p;
		  return c;
	}

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 double pr,ra,ti,nu;
		 pr= in.nextDouble();
		 ra=in.nextDouble();
		 ti=in.nextDouble();
		 nu=in.nextDouble();
		 double s= simpleIntrest(pr, ra, ti);
		 System.out.println("Simple Interest :" + s );
		 System.out.println("Compound Interest :" + compoundIntrest(pr, ra, ti,nu) );
		 
		// TODO Auto-generated method stub

	}

}
