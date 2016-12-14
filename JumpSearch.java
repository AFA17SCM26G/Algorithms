
public class JumpSearch {
	int jumpSearch(int [] array,int key)
	{
		int n=array.length;
		int step=(int) Math.sqrt(n);
		int prev=0;
		while (array[(Math.min(step, n))-1]<key)
		{
			prev=step;
			step +=(int) Math.sqrt(n);
			if(prev>n)
			{
				return -1;
			}
		}
		while(array[prev]<key)
		{
			prev++;
			if(prev==Math.min(step, n))
			{
				return -1;
			}
		}
		if(array[prev]==key)
		{
			return prev;
		}
		return -1;
	}

}
