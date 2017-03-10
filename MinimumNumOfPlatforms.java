import java.util.*;

public class MinimumNumOfPlatforms {
	void minimumNumOfPlatforms(double [] arrival,double [] depature)
	{
		int count=0,platforms=0,i=0,j=0;
		Arrays.sort(arrival);
		Arrays.sort(depature);
		while(i<arrival.length)
		{
			if(arrival[i]<depature[j])
			{
				count++;
				platforms=Math.max(platforms, count);
				i++;	
			}
			else
			{
				count--;
				j++;
			}
		}
		System.out.println("Minimum number of platforms required are"+" "+platforms);
	}

}
