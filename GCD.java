
public class GCD {
	int gcd(int a,int b)
	{
		if(a%b==0)
		{
			return a;
		}
		return gcd(a%b,a);
	}

}
