import java.util.Arrays;

public class MinimumNumberOfGates {
	public int findMinimumGates(int [] arrivals,int[] departures,int flights)
	{
		Arrays.sort(arrivals);
		Arrays.sort(departures);
		int num_gates=0;
		int i=0;
		int j=0;
		while(i<flights || j<flights)
		{
			if(i<flights && j<flights)
			{
				if(arrivals[i]<=departures[j])
				{
					num_gates++;
					i++;
				}
				else 
				{
					num_gates--;
					j++;
				}
			}
			else if(i<flights)
			{
				num_gates++;
				i++;
			}
			else
			{
				num_gates--;
				i++;
			}
		}
		return num_gates;
	}
	

}
