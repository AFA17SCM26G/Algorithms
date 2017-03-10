
public class BinaryAddition {
	void add_binary(int a,int b)
	{
		int c=a+b;
		String result="";
        result=recursion(2,c,result);
	    System.out.println(result);
	}
	String recursion(int c,int d,String result)
	{
		if(d/c==1 && d%c==0)
		{
			result= "10"+result;
			//System.out.println(result);
			return result;
		}
		if(d/c==0 && d%c==1)
		{
			result="1"+ result;
			//System.out.println(result);
			return result;
		}

			result=Integer.toString(d%c)+result;
	    	return recursion(c,d/c,result);
	    	
	}
}
