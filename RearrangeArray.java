/*
 * Author: Anvesh Gangasani
 * Date:Jan-3-2017
 * Complexity: Time O(n) and Space O(1)
 * Rearrange the array with alternate high and low elements
 */
public class RearrangeArray {
	public void alternateLowHigh(int [] arr)
	{
		int n= arr.length;
		int i=1;
		while(i<n)
		{
			if(arr[i]<arr[i-1])
			{
				int temp= arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if(i+1 <n && arr[i]<arr[i+1])
			{
				int temp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			i=i+2;
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
