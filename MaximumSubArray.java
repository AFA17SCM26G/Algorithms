
public class MaximumSubArray {
	int maxSubArray(int[] array)
	{
		int current_max=array[0];
		int previous_max=array[0];
		int start=0,nstart = 0;
		int end=0,nend = 0;
		for(int i=1;i<array.length;i++)
		{
			
			/*current_max=Math.max(array[i],current_max+array[i]);
			previous_max=Math.max(previous_max, current_max);
			if(current_max==previous_max && start==0 && end==0)
			{
				start=i;
			}
			if(current_max==previous_max && start!=0 )
			{
				end=i;
			}*/
			nstart = start;
			nend = end;
			if(array[i] > current_max + array[i]){
				current_max = array[i];
				nstart = i;
				nend = i;
			}
			else{
				current_max = current_max + array[i];
				nend = i;
			}
			if(previous_max < current_max){
				previous_max = current_max;
				start = nstart;
				end = nend;
			}
		}
		System.out.print("Maximum Sum of Sub array is : " );
		for(int j=start;j<=end;j++)
		{
			
			System.out.print(array[j]+" ");
			
		}
		System.out.println(" ");
		return previous_max;
	}

}
