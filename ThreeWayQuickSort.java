
public class ThreeWayQuickSort {
	IndexValues IV= new IndexValues();
	void partition(int [] array,int l,int r,int i,int j)
	{
		int pivot=array[l];
		int mid=l;
		while(mid<=r)
		{
			if (array[mid]<pivot)
			{
				int temp=array[l];
				array[l]=array[mid];
				array[mid]=temp;
				l++;
				mid++;
			}
			else if (array[mid]==pivot)
			{
				mid++;
			}
			else if(array[mid]>pivot)
			{
				int temp=array[mid];
				array[mid]=array[r];
				array[r]=temp;
				r--;
			}
			
		}
		IV.i=l-1;
		IV.j=mid;

	}
	void quickSort(int [] array,int l,int r)
	{
		if(l<r)
		{
			partition(array,l,r,IV.i,IV.j);
			quickSort(array,l,IV.i);
			quickSort(array,IV.j,r);
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
class IndexValues
{
	int i,j;
}
