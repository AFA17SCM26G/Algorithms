
public class InterpolationSearch {
	int interpolationSearch(int [] array,int key)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high && array[low]<=key && array[high]>=key)
		{
			int pos=low+(int)((double)(high-low)/(array[high]-array[low]))*(key-array[low]);
			if(array[pos]==key)
			{
				return pos;
			}
			else if(array[pos]<key)
			{
				low=pos+1;
			}
			else
				high=pos-1;
		}
		return -1;
	}

}
