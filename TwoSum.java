import java.util.*;

public class TwoSum {
	void twoSum(int[] array,int sum)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		int i=0,j=array.length-1;
		while(i<j)
		{
			if(array[i]+array[j]==sum)
			{
				result.add(i);
				result.add(j);
				break;
			}
			else if(array[i]+array[j]>sum)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		if(result.size()<=0)
		{
			System.out.println("None of the pairs adding to sum"+" "+sum);
		}
		else
		{
			System.out.println("the pairs are"+" ");
			for(int k=0;k<result.size();k++)
			{
				System.out.print(result.get(k)+" ");
			}
		
		}
	
	}

}
