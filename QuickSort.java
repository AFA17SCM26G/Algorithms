
public class QuickSort {
	int partition(int [] array,int l,int r)
	{
		int pivot=array[r];
		int mid=l;
		int pivot_index=l;
		while(mid<=r-1)
		{
			if (array[mid]<=pivot)
			{
				int temp=array[pivot_index];
				array[pivot_index]=array[mid];
				array[mid]=temp;
				pivot_index++;
			}
			mid++;
		}
		int temp=array[pivot_index];
		array[pivot_index]=array[r];
		array[r]=temp;
		return pivot_index;
	}
	void quickSort(int [] array,int l,int r)
	{
		if(l<r)
		{
			int i=partition(array,l,r);
			quickSort(array,l,i-1);
			quickSort(array,i+1,r);
		}

	}
	void driver(int [] array,int l,int r)
	{
		quickSort(array,l,r);
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			
		}
	}

}
