
public class MergeTwoSortedArrays {
	void mergeTwoSortedArrays(int [] arr1,int [] arr2)
	{
		int i=arr1.length-1,j=arr1.length-1;
		while(i>=0 && j>=0)
		{
			if(arr1[i]>=0 && arr1[j]>=0)
			{
				i--;
				j--;
			}
			else if (arr1[i]>=0 && arr1[j]<0)
			{
				arr1[j]=arr1[i];
				i--;
				j--;
			}
			else
				i--;
		}
		int l=0,n=0,m=arr2.length;
		while(n<arr2.length)
		{
			if(arr1[m] < arr2[n])
			{
				arr1[l]=arr1[m];
				m++;
				l++;
			}
			else
			{
				arr1[l]=arr2[n];
				l++;
				n++;
			}
		}
		for(int k=0;k<arr1.length;k++)
		{
			System.out.print(arr1[k]+" ");
		}
	}

}
