
public class LCM {
	
	public  long lcm_gcd(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}

	public  long lcm(long c,long d)
	{
	   long result = lcm_gcd(c, d);
	    return result;
	}
	public  long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

}
