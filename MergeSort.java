
public class MergeSort {
	void mergeSort(int [] array,int l,int r)
	{
		if(l<r)
		{
			int mid=l+(r-l)/2;
			mergeSort(array,l,mid);
			mergeSort(array,mid+1,r);
			merger(array,l,r,mid);
		}

	}
	void merger(int []array,int l,int r,int mid)
	{
		int [] left_array=new int [mid-l+1];
		int [] right_array=new int [r-mid];
		for(int i=0;i<mid-l+1;i++)
		{
			left_array[i]=array[l+i];
		}
		for (int j=0;j<r-mid;j++ )
		{
			right_array[j]=array[mid+1+j];
		}
		int m=0;int n=0;int k=l;
		while(m<left_array.length && n<right_array.length)
		{
			if(left_array[m]<right_array[n])
			{
				array[k]=left_array[m];
				m++;
			}
			else
			{
				array[k]=right_array[n];
				n++;
			}
			k++;
		}
		while(m<left_array.length)
		{
			array[k]=left_array[m];
			m++;
			k++;
		}
		while(n<right_array.length)
		{
			array[k]=right_array[n];
			n++;
			k++;
		}
	}
	void driver(int [] array,int l,int r)
	{
		mergeSort(array,l,r);
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			
		}
	}
}

