
public class ContainerWithMostWater {
	int maxArea(int [] array)
	{
		int l=0,r=array.length-1,maxarea=0;
		if(l<r)
		{
			maxarea=Math.max(maxarea, Math.min(array[l], array[r])*(r-l));
			if(array[l]<array[r])
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return maxarea;
	}

}
