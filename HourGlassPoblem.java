
public class HourGlassPoblem {
	public int minHour(int [] [] matrix,int s1,int s2,int min_value)
	{
		int n=matrix.length;
		if(s1>n-2 || s2>n-2)
		{
			return 0;
		}
		else
		{
		int sum=0;
		for(int i=s1;i<s1+3;i++)
		{
			for(int j=s2;j<s2+3;j++)
			{
				if((i==s1+1&&j==s1+2)||(i==s1+1&&j==s2+2))
				{
					continue;
				}
				else
				{
					sum=sum+matrix[i][j];
				}
			}
		}
		if(sum<min_value)
		{
			min_value=sum;
		}
		//System.out.print(min_value+" ");
		minHour(matrix,s1+1,s2+1,min_value);
		//System.out.print(min_value+" ");
		return min_value;
		}
	}
	public void driverMethod(int[][] matrix)
	{
		int min_value=Integer.MAX_VALUE;
		System.out.println(minHour(matrix,6,6,min_value));
		
	}

}
